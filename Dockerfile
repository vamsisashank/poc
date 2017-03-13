FROM java:8

ADD target/webapp-springboot-angularjs-seed.jar /opt/demo/webapp-springboot-angularjs-seed.jar

EXPOSE 8080

CMD java -jar /opt/demo/webapp-springboot-angularjs-seed.jar