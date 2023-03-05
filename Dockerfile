FROM openjdk:latest

ADD target/spring-data-mongodb-example-0.0.1-SNAPSHOT.jar spring-data-mongodb-example.jar

ENTRYPOINT ["java","-jar","spring-data-mongodb-example.jar"]

EXPOSE 8080