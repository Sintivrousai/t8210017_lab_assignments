FROM openjdk:17
WORKDIR /Docker
COPY target/concerts-1.0-SNAPSHOT.jar /Docker/concerts-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "concerts-1.0-SNAPSHOT.jar"]