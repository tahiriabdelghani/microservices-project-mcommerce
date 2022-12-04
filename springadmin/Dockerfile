FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springadmin.jar
ENTRYPOINT ["java","-jar","/springadmin.jar"]
EXPOSE 9105