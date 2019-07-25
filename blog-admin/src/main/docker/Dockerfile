FROM openjdk:8-jdk-alpine

VOLUME /tmp

ADD blog-admin-1.0.0.jar /data/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/app.jar","--spring.profiles.include=pro"]