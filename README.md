# Rest-Services

This project basically is written in Java & spring boot .
Responds with json data upon request.

#Pre Requisites
  -   Java version: 1.8.0_241  & maven--- apache-maven-3.6.2

#Installation -  
  git clone the project , open in any IDE or use command prompt , execute mvn clean install (this will build the project) ,                     To deploy locally use below commands from command line 
      >>>>          java -jar target/rest-service-0.0.1-SNAPSHOT.jar
      or
      >>>>          mvn spring-boot:run   (by default 8080)
      or mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8085   (for a specified port number if port is busy )

You are good to go (local deployment should happen to 8080 port)
  
#Pre Requisites - 
API lists >>>>         localhost:8080/updates,localhost:8080/greeting,localhost:8080/information
  use GET requests to get JSON as response
