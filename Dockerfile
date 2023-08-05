FROM openjdk:8
EXPOSE 8282
ADD target/spring-docker-online-test-maven.jar spring-docker-online-test-maven.jar
ENTRYPOINT ["java","-jar","spring-docker-online-test-maven.jar"]