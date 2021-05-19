package io.metaloom.poc.db;

import java.util.UUID;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface PocGroupDao {

	/**
	 * Create a new group.
	 * 
	 * @param name
	 * @return
	 */
	Single<? extends PocGroup> createGroup(String name);

	/**
	 * Delete the group with the uuid.
	 * 
	 * @param uuid
	 * @return
	 */
	Completable deleteGroup(UUID uuid);

	/**
	 * Update the group element.
	 * 
	 * @param group
	 * @return
	 */
	Completable updateGroup(PocGroup group);

	/**
	 * Load the group with the given uuid.
	 * 
	 * @param uuid
	 * @return
	 */
	Maybe<? extends PocGroup> loadGroup(UUID uuid);

	// Users
	Completable addUserToGroup(PocGroup group, PocUser user);

	Completable removeUserFromGroup(PocGroup group, PocUser user);

	Observable<PocUser> loadUsers(PocGroup group);

}
