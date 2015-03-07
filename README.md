<<<<<<< HEAD
# A web service to generate nth Fibonacii number
=======
# Dropwizard + Gradle = &hearts; [![Build Status](https://secure.travis-ci.org/smarchive/dropwizard-gradle.png)](http://travis-ci.org/smarchive/dropwizard-gradle)

Minimal SETUP of getting Dropwizard going with Gradle.


## Gotchas

You need Gradle 1.1 or higher, otherwise you'll run into a [dependency resolution bug](http://issues.gradle.org/browse/GRADLE-2285).

## Jar File creation

This example is using the [Gradle OneJar Plugin](https://github.com/rholder/gradle-one-jar) which will create
a JAR file of the project including all dependencies, similar to the [Maven Assembly Plugin](http://maven.apache.org/plugins/maven-assembly-plugin/)
or the [Maven Shade Plugin](http://maven.apache.org/plugins/maven-shade-plugin/).

To create a JAR with all dependencies just run `./gradlew stage`. The resulting JAR will be saved as `./build/libs/dropwizard-gradle-master.jar`.

You can simply run the application with `java -jar build/libs/dropwizard-gradle-master server src/dist/config/helloworld.yml`.

## Gradle Application Plugin

An alternative to creating a fat JAR is using the [Gradle Application Plugin](http://www.gradle.org/docs/current/userguide/application_plugin.html).



You can also use the `run` task to start the application.
