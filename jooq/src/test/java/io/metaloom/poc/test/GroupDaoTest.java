package io.metaloom.poc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.metaloom.poc.db.PocGroup;
import io.metaloom.poc.db.PocGroupDao;

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
}
