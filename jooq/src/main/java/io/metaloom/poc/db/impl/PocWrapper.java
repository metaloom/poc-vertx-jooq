package io.metaloom.poc.db.impl;

public interface PocWrapper<T> {

	/**
	 * Return the wrapped jooq POJO
	 * 
	 * @return
	 */
	T getDelegate();

}
