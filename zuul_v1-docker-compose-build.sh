#!/bin/bash
cd /home/geekseong/Projects/api-gateway
./gradlew clean build
cd ./zuul_v1
docker-compose build
