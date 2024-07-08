ARG MSVC_NAME=msvc-cursos

FROM openjdk:21 as builder

ARG MSVC_NAME

WORKDIR /app/$MSVC_NAME

COPY ./pom.xml /app
COPY ./$MSVC_NAME/.mvn ./.mvn
COPY ./$MSVC_NAME/mvnw .
COPY ./$MSVC_NAME/pom.xml .

RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/

COPY ./$MSVC_NAME/src ./src

RUN ./mvnw clean package -DskipTests

FROM openjdk:21

ARG MSVC_NAME

WORKDIR /app
RUN mkdir ./logs
ARG MSVC_NAME=msvc-cursos
ARG TARGET_FOLDER=/app/$MSVC_NAME/target
COPY --from=builder $TARGET_FOLDER/msvc-cursos-0.0.1-SNAPSHOT.jar .
ENV PORT 8002
EXPOSE $PORT

CMD ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]

