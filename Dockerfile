FROM openjdk:11
EXPOSE 4040
ADD target/cicd-sample.jar cicd-sample.jar
ENTRYPOINT ["java","-jar","/cicd-sample.jar"]
