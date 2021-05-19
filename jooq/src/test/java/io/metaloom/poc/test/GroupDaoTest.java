package io.metaloom.poc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.metaloom.poc.db.PocGroup;
import io.metaloom.poc.db.PocGroupDao;
import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.PocUserDao;

public class GroupDaoTest extends AbstractDaoTest {

	@Test
	public void testCreateGroup() {
		PocGroupDao groupDao = groupDao();

		// Create Group
		PocGroup group = groupDao.createGroup("test").blockingGet();

		// Update Group
		group.setName("NewName");
		groupDao.updateGroup(group).blockingAwait();

		// Reload Group
		PocGroup reloadedGroup = groupDao.loadGroup(group.getUuid()).blockingGet();
		assertEquals("NewName", reloadedGroup.getName());
	}

	@Test
	public void testUserGroup() {
		PocGroupDao groupDao = groupDao();
		PocUserDao userDao = userDao();

		// Create Group / Users
		PocGroup group = groupDao.createGroup("test").blockingGet();
		PocUser user1 = userDao.createUser("user1").blockingGet();
		PocUser user2 = userDao.createUser("user2").blockingGet();

		// Assign users to group
		groupDao.addUserToGroup(group, user1).blockingAwait();
		groupDao.addUserToGroup(group, user2).blockingAwait();

		// Load users
		groupDao.loadUsers(group).blockingForEach(user -> {
			System.out.println(user.getUsername());
		});
	}
}
