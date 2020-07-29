FROM openjdk:8-jdk-alpine3.9

ARG app_dir='/app/booking_api'
ARG db_dir='/data/h2'

USER root

RUN mkdir -p $app_dir
RUN mkdir -p $db_dir
RUN chmod -R 777 $app_dir
RUN chmod -R 777 $db_dir

WORKDIR $app_dir
COPY ./build/libs/booking_api-*.jar app.jar
COPY ./docker/docker-app-config.properties application.properties

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.config.location=application.properties"]
