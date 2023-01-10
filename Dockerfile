FROM adoptopenjdk/openjdk:17-alpine

ADD build/libs/gym-java.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080
