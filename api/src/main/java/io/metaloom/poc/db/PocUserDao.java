package io.metaloom.poc.db;

import java.util.UUID;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

public interface PocUserDao {

	/**
	 * Create and store a new user with the given username.
	 * 
	 * @param username
	 * @return
	 */
	Single<? extends PocUser> createUser(String username);

	/**
	 * Load the user with the given uuid.
	 * 
	 * @param uuid
	 * @return
	 */
	Maybe<? extends PocUser> loadUser(UUID uuid);

	/**
	 * Update the user using the provided element information.
	 * 
	 * @param user
	 * @return
	 */
	Completable updateUser(PocUser user);

	/**
	 * Delete the user.
	 * 
	 * @param user
	 * @return
	 */
	Completable deleteUser(PocUser user);

}
