# Java App

## Technology Stack

|            | Technology                                  |
|------------|---------------------------------------------|
| Language   | [Java 19](https://docs.oracle.com/en/java/) |
| Unit Tests | [jUnit 5](https://junit.org/junit5/)        |

## Development

### Prerequisites

1. Install [OpenJDK 19+](https://openjdk.org/)

### Quickstart

You can use IDE for all the development routines. However, if you prefer having more control, you can use the commands
below.

```sh
# Compile the app.
javac \
  -Xlint:all \
  --class-path ./src \
  -d ./out/production/java-app \
  ./src/module-info.java ./src/**/*.java

# Run the app.
java \
  --module-path ./out/production/java-app \
  --module com.alexeykostevich.app/com.alexeykostevich.app.Main
```

### Unit Tests

```sh
# Compile the unit tests.
javac \
  --module-path ./out/production/java-app:./lib/junit-platform-console-standalone-1.9.2.jar \
  --add-modules com.alexeykostevich.app,junit.platform.console.standalone \
  --patch-module com.alexeykostevich.app=./test \
  --add-reads com.alexeykostevich.app=junit.platform.console.standalone \
  -d ./out/test/java-app \
  ./test/**/*.java

# Run the unit tests.
java \
  --module-path ./out/production/java-app:./lib/junit-platform-console-standalone-1.9.2.jar \
  --add-modules com.alexeykostevich.app \
  --patch-module com.alexeykostevich.app=./out/test/java-app \
  --add-reads com.alexeykostevich.app=junit.platform.console.standalone \
  --add-opens com.alexeykostevich.app/com.alexeykostevich.app=junit.platform.console.standalone \
  -jar ./lib/junit-platform-console-standalone-1.9.2.jar \
    --scan-modules
```
