FROM maven:3.8.3-openjdk-16 as BUILD
COPY pom.xml /app/
COPY src /app/src/
WORKDIR /app
RUN mvn clean package -DskipTests

FROM openjdk:16-jre-alpine
COPY --from=BUILD /app/target/*.jar  application.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev,datastore", "/application.jar"]