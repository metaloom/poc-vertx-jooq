package io.metaloom.poc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.PocUserDao;

public class UserDaoTest extends AbstractDaoTest {

	@Test
	public void testCreateUser() {
		PocUserDao userDao = userDao();

		// Create User
		PocUser user = userDao.createUser("test").blockingGet();

		// Update User
		user.setUsername("NewName");
		userDao.updateUser(user).blockingAwait();

		// Reload User
		PocUser reloadedUser = userDao.loadUser(user.getUuid()).blockingGet();
		assertEquals("NewName", reloadedUser.getUsername());
	}
}
