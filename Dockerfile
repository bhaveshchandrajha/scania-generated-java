# --- Stage 1: Build Stage ---
# Use Maven with JDK 17 to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 1. Copy only the pom.xml first to fetch dependencies (better caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# 2. Copy the source code, Angular UI (same layout as repo: /app/warranty-ui), and build
COPY src ./src
COPY warranty-ui ./warranty-ui
RUN mvn clean package -DskipTests

# --- Stage 2: Runtime Stage ---
# Use a lightweight JRE 17 image for the final container
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# 3. Copy the built JAR from the build stage
# Based on your pom.xml: <artifactId>warranty-claim-management</artifactId> and <version>1.0.0</version>
COPY --from=build /app/target/warranty-claim-management-1.0.0.jar app.jar

# 4. Listen on 8080 inside the container (matches EXPOSE and -p 80:8080 in deploy).
#    application.properties uses 8081 for local runs; SERVER_PORT overrides the JAR.
ENV SERVER_PORT=8080
EXPOSE 8080

# 5. Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
