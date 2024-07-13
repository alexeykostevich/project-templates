# Spring MVC App

## Technology Stack

|            | Technology                                  |
|------------|---------------------------------------------|
| Language   | [Java 21](https://docs.oracle.com/en/java/) |
| Framework  | [Spring 6.1](https://spring.io/)            |
| Web Server | [Tomcat 10.x](https://tomcat.apache.org/)   |

## Development

### Prerequisites

1. Install [OpenJDK 21+](https://openjdk.org/)
2. Install [Docker Desktop](https://docs.docker.com/desktop/)

### Quickstart

```sh
# Package the app in a WAR.
mvn package

# Start Tomcat with the mounted WAR file.
docker-compose up --detach
```

The application will be available at http://localhost:8080/spring-mvc-app-1.0-SNAPSHOT/:
- JSP page: http://localhost:8080/spring-mvc-app-1.0-SNAPSHOT/
- REST API: http://localhost:8080/spring-mvc-app-1.0-SNAPSHOT/api/courses

The repository includes an IntelliJ IDEA configuration to attach the debugger to a remote app.

### Resources

- [IntelliJ IDEA - Deploy and debug a Java web application inside a container running Tomcat](https://www.jetbrains.com/help/idea/docker-tutorial-tomcat-debug.html)
