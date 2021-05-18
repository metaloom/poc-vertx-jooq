# Vert.x JOOQ PoC

This Proof of Concepts showcases how jooq can be used in combination with Vert.x.

* Vert.x version: 4.0.3
* Dagger version: 2.35.1
* JOOQ version:

The project creates a small API server and consists of the following modules:

* api - API for REST implementation
* bom - BOM POM for dependency management
* common - Common dependencies for implementation modules
* rest - REST API implementation
* server - Server module which creates the shaded jar
