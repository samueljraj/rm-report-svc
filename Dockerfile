FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/report-svc-1.0-SNAPSHOT.jar report-svc-app.jar
ENTRYPOINT ["java","-jar","report-svc-app.jar"]