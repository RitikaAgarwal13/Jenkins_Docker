FROM openjdk:11
EXPOSE 8081
ADD target/detail-service.jar detail-service.jar
ENTRYPOINT ["java","-jar","/detail-service.jar"]
