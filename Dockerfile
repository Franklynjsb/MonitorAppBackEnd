FROM amazoncorretto:8-alpine-jdk
EXPOSE 8080
MAINTAINER FrancoQuijada
COPY target/ma-0.0.1-SNAPSHOT.jar   ma-app.jar
ENTRYPOINT  ["java", "-jar", "/ma-app.jar"]