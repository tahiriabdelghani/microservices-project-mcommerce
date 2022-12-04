FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} microservice-paiement.jar
ENTRYPOINT ["java","-jar","/microservice-paiement.jar"]
EXPOSE 9003