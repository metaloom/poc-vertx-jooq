package io.metaloom.poc.server;

import io.metaloom.poc.ServerOption;
import io.metaloom.poc.server.jooq.DaggerServerComponent;
import io.metaloom.poc.server.jooq.ServerComponent;

public class ServerRunner {

	public static void main(String[] args) {
		ServerOption options = new ServerOption();
		options.setPort(8888);

		// Inject the options and build the dagger dependency graph
		ServerComponent serverComponent = DaggerServerComponent
			.builder()
			.configuration(options)
			.build();

		// Start the server
		serverComponent.restServer().start().subscribe(() -> {
			System.out.println("REST server started");
			System.out.println("Now connect to http://localhost:8888/hello");
		}, err -> {
			err.printStackTrace();
		});
	}

}
