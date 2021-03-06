# fairy-tales-jmod-jlink

Evaluating what was done in https://github.com/gradle-guides/building-java-9-modules and porting it to Maven, and
changing it to use JMOD and JLink.

## Prerequisites

To run this example, you must have installed:

- Java 11
- Maven 3.6.0

## How to build

Firstly, you must clone the *maven-jmod-plugin* and *maven-jlink-plugin* repository to build the plugins:

For Maven JMOD plugin:

```{bash}
git clone https://github.com/apache/maven-jmod-plugin.git
cd maven-jmod-plugin
```

For Maven JLINK plugin:

```{bash}
git clone https://github.com/apache/maven-jlink-plugin.git
cd maven-jmod-plugin
```

and then build each plugin:

```{bash}
mvn clean install
```

After that, change to this project's directory and run:
For this project, it is enough to run the Maven command below:

```{bash}
mvn clean package
```

## How to run

Since the build generates a Docker image, it is enough to execute:

```{bash}
docker run -it --name test-4 andretadeu/fairy-docker-jmod-jlink-slim:1.0-SNAPSHOT
```