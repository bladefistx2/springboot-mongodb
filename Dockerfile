#FROM ibmjava:jre
 #RUN mkdir /opt/shareclasses
 #RUN mkdir /opt/app
 #COPY japp.jar /opt/app

#FROM openjdk:11-ea-11-jdk-slim

#FROM openjdk:8-jdk-alpine
#FROM ibmjava:jre
FROM openjdk:11-ea-11-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=default"]