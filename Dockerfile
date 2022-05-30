FROM amazoncorretto:11-alpine-jdk
MAINTAINER kirankumarpolusani@gmail.com
COPY target/Sb-Rest-Jpa-H2-Example-1.0-SNAPSHOT.jar sb-rest-jpa-h2-example-1.0.jar
ENTRYPOINT ["java","-jar","/sb-rest-jpa-h2-example-1.0.jar"]