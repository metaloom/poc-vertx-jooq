package io.metaloom.poc.db.impl;

import java.util.UUID;

import io.metaloom.poc.db.PocUser;
import io.metaloom.poc.db.jooq.tables.pojos.User;

public class PocUserImpl implements PocUser, PocWrapper<User> {

	private User delegate;

	public PocUserImpl(User delegate) {
		this.delegate = delegate;
	}

	@Override
	public UUID getUuid() {
		return delegate.getUuid();
	}

	@Override
	public PocUser setUuid(UUID uuid) {
		delegate.setUuid(uuid);
		return this;
	}

	@Override
	public String getUsername() {
		return delegate.getUsername();
	}

	@Override
	public PocUser setUsername(String username) {
		delegate.setUsername(username);
		return this;
	}

	@Override
	public String getPasswordHash() {
		return delegate.getPasswordhash();
	}

	@Override
	public PocUser setPasswordHash(String hash) {
		delegate.setPasswordhash(hash);
		return this;
	}

	@Override
	public boolean isEnabled() {
		// NPE
		return delegate.getEnabled();
	}

	@Override
	public PocUser setEnabled(boolean flag) {
		delegate.setEnabled(flag);
		return this;
	}

	@Override
	public String getEmail() {
		return delegate.getEmail();
	}

	@Override
	public PocUser setEmail(String email) {
		delegate.setEmail(email);
		return this;
	}

	@Override
	public String getFirstname() {
		return delegate.getFirstname();
	}

	@Override
	public PocUser setFirstname(String firstname) {
		delegate.setFirstname(firstname);
		return this;
	}

	@Override
	public String getLastname() {
		return delegate.getLastname();
	}

	@Override
	public PocUser setLastname(String lastname) {
		delegate.setLastname(lastname);
		return this;
	}

	@Override
	public User getDelegate() {
		return delegate;
	}

}
