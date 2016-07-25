#!/bin/sh

cd resource-demoapp

export TERM=${TERM:-dumb}

gradle -Dorg.gradle.native=false build

ls build/libs

cp build/libs/demoapp.jar ../resource-jar

cp Dockerfile ../resource-jar
