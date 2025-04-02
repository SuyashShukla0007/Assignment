# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /src

# Copy the built JAR file into the container
COPY target/binarySearch-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
