FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gateway-server.jar
ENTRYPOINT ["java","-jar","/gateway-server.jar"]
EXPOSE 9004