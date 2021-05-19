package io.metaloom.poc.db.impl;

import static io.metaloom.poc.util.JooqWrapperHelper.unwrap;
import static io.metaloom.poc.util.JooqWrapperHelper.wrap;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.jooq.Configuration;

import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.PocUserDao;
import io.metaloom.poc.db.jooq.tables.pojos.User;
import io.metaloom.poc.db.jooq.tables.records.UserRecord;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

public class PocUserDaoImpl extends
	AbstractReactiveVertxDAO<UserRecord, io.metaloom.poc.db.jooq.tables.pojos.User, UUID, Single<List<io.metaloom.poc.db.jooq.tables.pojos.User>>, Single<Optional<io.metaloom.poc.db.jooq.tables.pojos.User>>, Single<Integer>, Single<UUID>>
	implements PocUserDao {

	public PocUserDaoImpl(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
		super(io.metaloom.poc.db.jooq.tables.User.USER, io.metaloom.poc.db.jooq.tables.pojos.User.class,
			new ReactiveRXQueryExecutor<UserRecord, io.metaloom.poc.db.jooq.tables.pojos.User, UUID>(configuration, delegate,
				io.metaloom.poc.db.jooq.tables.mappers.RowMappers.getUserMapper()));
	}

	@Override
	protected UUID getId(io.metaloom.poc.db.jooq.tables.pojos.User object) {
		return object.getUuid();
	}

	@Override
	public Single<? extends PocUser> createUser(String username) {
		User user = new User();
		user.setUsername(username);
		return insertReturningPrimary(user).map(pk -> new PocUserImpl(user.setUuid(pk)));
	}

	@Override
	public Maybe<? extends PocUser> loadUser(UUID uuid) {
		return wrap(findOneById(uuid), PocUserImpl.class);
	}

	@Override
	public Completable updateUser(PocUser user) {
		Objects.requireNonNull(user, "User must not be null");
		return update(unwrap(user)).ignoreElement();
	}

	@Override
	public Completable deleteUser(PocUser user) {
		Objects.requireNonNull(user, "User must not be null");
		return deleteById(user.getUuid()).ignoreElement();
	}

}
