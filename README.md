# Full Stack Development with Java Spring Boot, React, and MongoDB – Full Course

Youtube link: https://www.youtube.com/watch?v=5PdEmeopJVQ

Springboot initializer 
<hr/>

- Project: Maven
- Language: Java
- SpringBoot: 2.7.13
  - Project Metadata:
    * Group: com.nati
    * Artifact: movies
    * Name: movies
    * Description: A simple API related to movies
    * Package name: com.nati.movies
    * Packaging: Jar
    * Java: 11
  - Dependencies
    * Lombok [Developer Tools]
    * Spring Web [Web]
    * Spring Data MongoDB [NoSQL]
    * Spring Tools DevTools [Developer Tools]
  - External Dependencies 
    * [Spring Dotenv v2.5.4](https://mvnrepository.com/artifact/me.paulschwarz/spring-dotenv)
      * *issues with the v3.0.0 & v4.0.0*


**Env file** <br/>
Path: resources/.env
> MONGO_DATABASE="movie-api-db" <br/>
> MONGO_USER="nati" <br/>
> MONGO_PASSWORD="#######" <br/>
> MONGO_CLUSTER="cluster0.qixvlak.mongodb.net"