FROM openjdk:18-alpine as builder
WORKDIR application
ADD /target/ThymeLeafCRUDProject-0.0.1-SNAPSHOT.jar ./
RUN java -Djarmode=layertools -jar ThymeLeafCRUDProject-0.0.1-SNAPSHOT.jar extract

FROM openjdk:18-alpine
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]