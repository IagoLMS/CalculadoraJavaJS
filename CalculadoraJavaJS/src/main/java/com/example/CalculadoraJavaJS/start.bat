@echo off
start cmd /k mvn spring-boot:run
timeout /t 5
start http://localhost:8080