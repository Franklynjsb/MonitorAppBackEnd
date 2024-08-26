FROM amazoncorretto:8-alpine-jdk
EXPOSE 8080
MAINTAINER FJQ
COPY ma-0.0.1-SNAPSHOT.jar ma-app.jar
ENTRYPOINT ["java","-jar","/ma-app.jar"]