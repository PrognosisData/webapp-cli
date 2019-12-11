# webapp-cli
Example of Spring Boot Web Application with CLI

## Build
`mvn clean package`

## Run CLI
`java -jar webapp-cli-1.0-SNAPSHOT.jar --spring.main.web-application-type=none --cli test "Hello world"`

## Run Web App
`java -jar webapp-cli-1.0-SNAPSHOT.jar`

`curl http://localhost:8080/api/test/HelloWorld`

---
_Copyright (c) 2019 Prognosis Data Corp. All rights reserved._
