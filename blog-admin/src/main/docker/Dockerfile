FROM openjdk:8-jdk-alpine

EXPOSE 8001

ADD blog-admin-1.0.0.jar /data/blog-admin-1.0.0.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/blog-admin-1.0.0.jar","--spring.profiles.include=pro"]
