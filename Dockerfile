FROM eclipse-temurin:17-jre-alpine
EXPOSE 8080

WORKDIR /app
COPY target/weather-service-*.jar ./weather-service.jar

ENTRYPOINT ["java", "-jar", "weather-service.jar"]
