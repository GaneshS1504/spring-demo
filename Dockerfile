FROM openjdk:11
WORKDIR /opt
ENV PORT 8181
EXPOSE 8181
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/spring-app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar spring-app.jar 