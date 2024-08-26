FROM amazoncorretto:8-alpine-jdk
EXPOSE 8080
MAINTAINER FJQ
COPY target/ma-0.0.1-SNAPSHOT.jar maFronfjq-app.jar
ENTRYPOINT ["java","-jar","/maFronfjq-app.jar"]