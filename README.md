Project Description: Implementation of 4 CI/CD (Continuous Integration/Continuous Delivery) pipelines using Jenkins, Docker Compose, SonarQube, Nexus, and Kubernetes.

## Docker Compose for Jenkins + Nexus + Sonar
```bash
docker-compose up
```

- Jenkins: [http://localhost:8080/](http://localhost:8080/)
- Nexus: [http://localhost:8081/](http://localhost:8081/)
- SonarQube: [http://localhost:9000/](http://localhost:9000/)

## Run Spring Boot Application
```bash
mvn spring-boot:run
```
The Spring Boot Server will export the API on port `8092`.

## Run Angular Client
```bash
npm install
ng serve
```
[http://localhost:4300/](http://localhost:4300/)

Implemented Steps:

**Infrastructure with Docker Compose:**
Launch Jenkins, Sonar, and Nexus containers using Docker Compose to establish the CI/CD infrastructure.

**Code Management with Git Flow:**
Utilize Git Flow for application development, facilitating branch and version management of the source code.

**SonarQube Frontend and Backend Analysis:**
Evaluate the source code quality of both the backend and frontend parts of the application through in-depth analysis conducted by SonarQube.

**Nexus Artifact Backend:**
Utilize Nexus to store and organize backend artifacts.

**Nexus Artifact Frontend:**
Store and organize frontend artifacts using Nexus.

**Build and Publish Docker Images for Backend and Frontend:**
Create a Docker image for the backend part of the application and publish it to Docker Hub.

**Backend and Frontend Deployment on Kubernetes:**
Deploy the backend and frontend on Kubernetes.

**Slack Notification for Each Build:**
Integrate Slack notifications at each stage of the CI/CD pipeline to keep the team informed about successful builds or potential issues.