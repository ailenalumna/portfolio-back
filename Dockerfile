FROM amazoncorretto:19-alpine-jdk

MAINTAINER emaaristimuno

COPY target/proyecto-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
