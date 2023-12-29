FROM openjdk:17
LABEL authors="alokkulkarni"
VOLUME /tmp
EXPOSE 7676
COPY build/libs/charts-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]