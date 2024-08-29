# Use an official OpenJDK image as a parent image
FROM openjdk:17-jdk

RUN mkdir -p /etc/app

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file to the container
COPY build/libs/chatify-internal-api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
