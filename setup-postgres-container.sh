#!/bin/bash

echo "Starting database docker container"
docker run \
  --name postgres \
   -p 5432:5432 \
   -v $PWD/flyway/src/main/resources/db/migration/V1__initial_setup.sql:/docker-entrypoint-initdb.d/init.sql \
  --rm \
  -e POSTGRES_PASSWORD=finger \
     postgres:13.2
