FROM openjdk
ADD target/consumer.jar consumer.jar
ENTRYPOINT ["java","-jar","/consumer.jar"]