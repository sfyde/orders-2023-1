# orders-2023-1

## Technology:

- Maven 3.8.1
- Java 17

## Versioning

Using `${revision}` mechanism https://maven.apache.org/maven-ci-friendly.html

## Modules:

- api (orders-api) - data structures (java records), public interfaces
- application (orders-application) - domain logic implementation
- infrastructure (orders-infrastructure) - infrastructure implementation details required by domain (by application module)
