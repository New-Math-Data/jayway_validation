#!/usr/bin/env bash

./mvnw package -Dpackaging=docker -Dmicronaut.aot.enabled=true
docker run --rm --name local-instance -p 8080:8080 json-parse-api:latest