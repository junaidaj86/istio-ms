FROM openjdk:17-jdk-slim
COPY target/PaymentService-0.0.1-SNAPSHOT.jar payment-service.jar
ENTRYPOINT ["java", "-jar", "/payment-service.jar"]
