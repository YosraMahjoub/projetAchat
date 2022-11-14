FROM openjdk:11



ARG APP_NAME="achat"
ARG APP_VERSION="1.0"
ARG JAR_FILE="/target/${APP_NAME}-${APP_VERSION}.jar"

EXPOSE 8089

COPY ${JAR_FILE} ${APP_NAME}-${APP_VERSION}.jar
CMD ["java","-jar","achat-1.0.jar"]