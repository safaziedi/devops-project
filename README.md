## Docker Compose for jenkins + nexus + sonar
docker-compose up

jenkins: http://localhost:8080/
nexus: http://localhost:8081/ 
sonarqube : http://localhost:9000/ 

## Run Spring Boot application
```
mvn spring-boot:run
```
The Spring Boot Server will export API at port `8092`.

## Run Angular Client
```
npm install
ng serve     http://localhost:4300/
```
