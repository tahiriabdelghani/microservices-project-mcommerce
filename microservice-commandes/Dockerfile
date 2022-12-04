FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} microservice-commandes.jar
ENTRYPOINT ["java","-jar","/microservice-commandes.jar"]
EXPOSE 9002