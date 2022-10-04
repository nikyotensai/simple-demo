FROM openjdk:8-jdk
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ADD target/simple-demo.jar /simple-demo.jar

ENTRYPOINT ["java", "-jar", "/simple-demo.jar"]

