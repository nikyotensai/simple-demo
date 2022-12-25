FROM openjdk:8-jdk
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ADD target/simple-demo.jar /simple-demo.jar

ENTRYPOINT ["java","-XX:+UseContainerSupport","-XX:InitialRAMPercentage=50.0","-XX:MaxRAMPercentage=50.0","-Duser.timezone=Asia/Shanghai","-jar","/simple-demo.jar"]

