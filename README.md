# scania-generated-java

Warranty claim management demo migrated from RPG (HS1210 / HS1210D). Spring Boot application with REST APIs and embedded Angular UI build.

## Build

```bash
mvn -q -DskipTests package
```

## Run

```bash
mvn spring-boot:run
```

Listens on **all interfaces** (`server.address=0.0.0.0`), default port **8081** (see `src/main/resources/application.properties`).

## Configuration

- `warranty.claim.max-repair-age-days` — reject claim creation when repair date is older than this many days (default `19`).
