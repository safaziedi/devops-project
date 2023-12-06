## Docker Compose
docker-compose up

credentials:
jenkins: http://localhost:8080/    + docker logs jenkins si besoin adminPassword

nexus: http://localhost:8081/

sonarqube : http://localhost:9000/  


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
