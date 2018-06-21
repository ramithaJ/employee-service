
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./build/libs/employee-service-0.0.1-SNAPSHOT.jar /app.jar
ENV DB_USERNAME test
 CMD ["java","-jar", "app.jar" ,"--username=DB_USERNAME"]gralde
#ENTRYPOINT ["java","-jar","app.jar","--username=", DB_USERNAME]

