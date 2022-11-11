FROM openjdk:11
EXPOSE 8089
COPY ./target/achat-1.0-SNAPSHOT.jar achat-1.0-SNAPSHOT.jar
CMD ["java","-jar","achat-1.0-SNAPSHOT.jar"]