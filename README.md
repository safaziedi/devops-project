## slack notification 
https://app.slack.com/client/T069JKP1Q1L/C069ANYQ079

## Docker Compose for jenkins + nexus + sonar
docker-compose up

credentials:
jenkins: http://localhost:8080/    + docker logs jenkins si besoin adminPassword

nexus: http://localhost:8081/ 

sonarqube : http://localhost:9000/ 

## K8s
frontend : http://localhost:80
backend : http://localhost:8091 

## Docker Compose
docker-compose -f .\docker-compose-app.yaml up
frontend : http://localhost:4200
backend : http://localhost:8092 
 

## Run Spring Boot application
```
mvn spring-boot:run
```
The Spring Boot Server will export API at port `8091`.

## Run Angular Client
```
npm install
ng serve     http://localhost:4200/
```
