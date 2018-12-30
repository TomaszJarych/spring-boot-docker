FROM openjdk:8-jdk-alpine

WORKDIR /app


COPY contenerizedSpringBootApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8088

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","app.jar"]
