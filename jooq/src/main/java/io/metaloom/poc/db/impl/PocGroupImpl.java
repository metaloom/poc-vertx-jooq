package io.metaloom.poc.db.impl;

import java.util.UUID;

import io.metaloom.poc.db.PocElement;
import io.metaloom.poc.db.PocGroup;
import io.metaloom.poc.db.jooq.tables.pojos.Group;

public class PocGroupImpl implements PocGroup, PocWrapper<Group> {

	private final Group delegate;

	public PocGroupImpl(Group delegate) {
		this.delegate = delegate;
	}

	@Override
	public UUID getUuid() {
		return delegate.getUuid();
	}

	@Override
	public PocElement setUuid(UUID uuid) {
		delegate.setUuid(uuid);
		return this;
	}

	@Override
	public String getName() {
		return delegate.getName();
	}

	@Override
	public PocGroup setName(String name) {
		delegate.setName(name);
		return this;
	}

	@Override
	public Group getDelegate() {
		return delegate;
	}
}
