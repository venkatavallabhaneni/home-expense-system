FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} homeexpsys-general-app.jar
ENTRYPOINT ["java","-jar","/homeexpsys-general-app.jar"]
