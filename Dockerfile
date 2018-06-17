FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./build/libs/employee-service-0.0.1-SNAPSHOT.jar /app.jar
#CMD ["java","-jar", "app.jar" ,"--spring.config.location=resources/dev/application.yml"]gralde
ENTRYPOINT ["java","-jar","app.jar"]
