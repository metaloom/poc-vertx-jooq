package io.metaloom.poc.server.jooq;

import dagger.Binds;
import dagger.Module;
import io.metaloom.poc.rest.RESTServerImpl;
import io.metaloom.poc.server.RESTServer;

@Module
public abstract class PocBindModule {

	@Binds
	abstract RESTServer bindRESTServer(RESTServerImpl e);
}
