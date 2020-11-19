FROM openjdk:8-jdk
VOLUME /tmp
COPY target/localk8sdemo-0.0.1-SNAPSHOT.jar  app.jar
CMD ["sh", "-c", "java -jar /app.jar"]