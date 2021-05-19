package io.metaloom.poc.db.impl;

import static io.metaloom.poc.db.jooq.tables.User.USER;
import static io.metaloom.poc.db.jooq.tables.UserGroup.USER_GROUP;
import static io.metaloom.poc.util.JooqWrapperHelper.unwrap;
import static io.metaloom.poc.util.JooqWrapperHelper.wrap;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.jooq.Configuration;

import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.metaloom.poc.db.PocGroup;
import io.metaloom.poc.db.PocGroupDao;
import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.jooq.tables.daos.UserDao;
import io.metaloom.poc.db.jooq.tables.daos.UserGroupDao;
import io.metaloom.poc.db.jooq.tables.pojos.Group;
import io.metaloom.poc.db.jooq.tables.pojos.User;
import io.metaloom.poc.db.jooq.tables.pojos.UserGroup;
import io.metaloom.poc.db.jooq.tables.records.GroupRecord;
import io.metaloom.poc.db.jooq.tables.records.UserGroupRecord;
import io.metaloom.poc.db.jooq.tables.records.UserRecord;
import io.metaloom.poc.util.JooqWrapperHelper;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

public class PocGroupDaoImpl extends
	AbstractReactiveVertxDAO<GroupRecord, io.metaloom.poc.db.jooq.tables.pojos.Group, UUID, Single<List<io.metaloom.poc.db.jooq.tables.pojos.Group>>, Single<Optional<io.metaloom.poc.db.jooq.tables.pojos.Group>>, Single<Integer>, Single<UUID>>
	implements PocGroupDao {

	private final UserGroupDao userGroupDao;

	private final UserDao userDao;

	public PocGroupDaoImpl(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate, UserGroupDao userGroupDao, UserDao userDao) {
		super(io.metaloom.poc.db.jooq.tables.Group.GROUP, io.metaloom.poc.db.jooq.tables.pojos.Group.class,
			new ReactiveRXQueryExecutor<GroupRecord, io.metaloom.poc.db.jooq.tables.pojos.Group, UUID>(configuration, delegate,
				io.metaloom.poc.db.jooq.tables.mappers.RowMappers.getGroupMapper()));
		this.userGroupDao = userGroupDao;
		this.userDao = userDao;
	}

	@Override
	public Maybe<? extends PocGroup> loadGroup(UUID uuid) {
		return wrap(findOneById(uuid), PocGroupImpl.class);
	}

	@Override
	public Completable deleteGroup(UUID uuid) {
		Objects.requireNonNull(uuid, "Group uuid must not be null");
		return deleteById(uuid).ignoreElement();
	}

	@Override
	public Single<PocGroup> createGroup(String name) {
		Group group = new Group();
		group.setName(name);
		return insertReturningPrimary(group).map(pk -> new PocGroupImpl(group.setUuid(pk)));
	}

	@Override
	public Completable updateGroup(PocGroup group) {
		Objects.requireNonNull(group, "Group must not be null");
		return update(unwrap(group)).ignoreElement();
	}

	@Override
	public Completable addUserToGroup(PocGroup group, PocUser user) {
		UserGroup userGroup = new UserGroup();
		userGroup.setGroupUuid(group.getUuid());
		userGroup.setUserUuid(user.getUuid());
		return userGroupDao.insert(userGroup).ignoreElement();
	}

	@Override
	public Completable removeUserFromGroup(PocGroup group, PocUser user) {
		UserGroupRecord record = new UserGroupRecord(user.getUuid(), group.getUuid());
		return userGroupDao.deleteById(record).ignoreElement();
	}

	@Override
	public Observable<PocUser> loadUsers(PocGroup group) {
		ReactiveRXQueryExecutor<UserRecord, User, UUID> queryExecutor = userDao.queryExecutor();
		Single<List<User>> result = queryExecutor.findMany(dslContext -> dslContext.select()
			.from(USER_GROUP
				.join(USER)
				.on(USER.UUID.eq(USER_GROUP.USER_UUID))
				.where(USER_GROUP.GROUP_UUID.eq(group.getUuid())).asTable(USER))
			.coerce(USER));

		return result.flatMapObservable(list -> {
			return Observable.fromIterable(list);
		}).map(jooq -> {
			return JooqWrapperHelper.wrap(jooq, PocUserImpl.class);
		});
	}

	@Override
	protected UUID getId(Group object) {
		return object.getUuid();
	}
}
