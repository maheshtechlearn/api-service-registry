# Use a base image with Java installed
FROM eclipse-temurin:17-jre-alpine

# Expose the port your application runs on
EXPOSE 8081


# Copy the JAR file into the container
ADD target/api-service-registry-0.0.1-SNAPSHOT.jar api-service-registry-0.0.1-SNAPSHOT.jar


# Command to run the application
ENTRYPOINT ["java", "-jar", "api-service-registry-0.0.1-SNAPSHOT.jar"]
