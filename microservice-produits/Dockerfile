FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} microservice-produits.jar
ENTRYPOINT ["java","-jar","/microservice-produits.jar"]
EXPOSE 9001