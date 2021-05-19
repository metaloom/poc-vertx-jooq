package io.metaloom.poc.option;

import io.reactivex.Completable;

public interface RESTServer {

	Completable start();

	Completable stop();
}
