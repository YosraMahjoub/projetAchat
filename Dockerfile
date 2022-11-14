FROM openjdk:11
RUN apk --no-cache add curl
RUN curl -u admin:nexus -o achat-1.0.jar "http://192.168.1.22:8081/repository/maven-releases/tn/esprit/rh/achat/1.0/achat-1.0.jar" -L
ENTRYPOINT ["java","-jar","/achat-1.0.jar"]
EXPOSE 8089