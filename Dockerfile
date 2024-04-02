FROM openjdk:17
EXPOSE:8080
COPY target/ECommerce-Server.jar ECommerce-Server.jar
ENTRYPOINT ["java","-jar","/ECommerce-Server.jar"]