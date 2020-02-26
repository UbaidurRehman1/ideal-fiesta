# Requirements
- Docker
- maven
- Java 13

# How to run
- git clone https://github.com/UbaidurRehman1/ideal-fiesta
- cd ideal-fiesta/oktaIntegration
- ./run.sh

# Naming Server
-  http://localhost:8761

## How to Authenticate:
- post reuqst to http://localhost:8000/auth/signin with request body {"username": "ubaid", "password": "1234"}
- Then use this token, you can check the following URLs
- you can check okta config using 
- currently I have configured OKTA with my username 
- http://localhost:8000/auth/okta
- http://localhost:8000/app/employee/1
- http://localhost:8000/app/employee





