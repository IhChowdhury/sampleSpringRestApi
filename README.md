# sampleSpringBootRestApi
Java version: Java 8

To run this sample follow this instruction-
  1. Download and install xampp or wamp to create database in local machine
  2. open localhost/phpmyadmin and create database "sample_rest"
  3. Now download STS to tool from this location https://spring.io/tools to open this code and run.
  4. now clone this project into your machine and open this project
  5. run project as   spring boot app
  6. In this project for sample it has two api- <br/>
    a. localhost:8080/insertNewUser?name=Ibrahim Chowdhury&age=25.6 - to insert data to database <br/>
    b. http://localhost:8080/getUser?id=1&mediaType=json - to see data as json formate <br/>
    c. http://localhost:8080/getUser?id=1&mediaType=xml - to see data as xml formate <br/>
    
  7. 6(a) is a post resquest you can send this post request using postman software
  8. 6(b) & 6(c) is a get reqst you can see result from any browser
  
  **Note: 1. To see data using get request you have to first insert an user<br/>
          2. To run this project you have to first create database using ""sample_rest".<br/>
          3. No need to create any table.
          
          

To create executable jar to deplloy an tomcat server-
  1. Go to project directory and open command window
  2. Now type mvn clean install, it will create a executable jar file in target folder. if you want to create war file just add <code>\<packaging>war\</packaging></code> in pom.xml

to deploy in tomcat server you can see this site: https://www.baeldung.com/spring-boot-war-tomcat-deploy
