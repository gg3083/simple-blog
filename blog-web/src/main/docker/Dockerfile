FROM openjdk:8-jdk-alpine

EXPOSE 8443

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/blog-web-1.0.0.jar","--spring.profiles.include=pro"]
