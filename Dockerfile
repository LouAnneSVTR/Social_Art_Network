FROM maven:3.8.3-openjdk-16 as BUILD
COPY pom.xml /webandcloud/
COPY src /webandcloud/src/
WORKDIR /webandcloud
RUN mvn clean package -DskipTests

FROM openjdk:16-jdk
COPY --from=BUILD /app/target/*.jar  application.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev,datastore", "/application.jar"]