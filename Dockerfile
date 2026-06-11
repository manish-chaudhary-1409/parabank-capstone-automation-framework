FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /parabank-framework

COPY pom.xml .
COPY src ./src
COPY testng.xml .
COPY reports ./reports
COPY screenshots ./screenshots
COPY logs ./logs

RUN mvn dependency:resolve

CMD ["mvn", "clean", "test"]