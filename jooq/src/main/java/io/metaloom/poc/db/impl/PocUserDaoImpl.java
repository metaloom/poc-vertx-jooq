package io.metaloom.poc.db.impl;

import static io.metaloom.poc.util.JooqWrapperHelper.unwrap;
import static io.metaloom.poc.util.JooqWrapperHelper.wrap;

import java.util.Objects;
import java.util.UUID;

import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.PocUserDao;
import io.metaloom.poc.db.jooq.tables.daos.UserDao;
import io.metaloom.poc.db.jooq.tables.pojos.User;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

public class PocUserDaoImpl implements PocUserDao {

	private final UserDao userDao;

	public PocUserDaoImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Single<? extends PocUser> createUser(String username) {
		User user = new User();
		user.setUsername(username);
		return userDao.insertReturningPrimary(user).map(pk -> new PocUserImpl(user.setUuid(pk)));
	}

	@Override
	public Maybe<? extends PocUser> loadUser(UUID uuid) {
		return wrap(userDao.findOneById(uuid), PocUserImpl.class);
	}

	@Override
	public Completable updateUser(PocUser user) {
		Objects.requireNonNull(user, "User must not be null");
		return userDao.update(unwrap(user)).ignoreElement();
	}

	@Override
	public Completable deleteUser(PocUser user) {
		Objects.requireNonNull(user, "User must not be null");
		return userDao.deleteById(user.getUuid()).ignoreElement();
	}

}
