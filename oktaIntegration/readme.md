
# Naming Server
### Port Info
- 8761
### URLS 
- http://localhost:8761

# API Gateway Server
### Port Info
- 8111

# Rest Client
### Port Info
- 8000

## How to Authenticate:
 - post reuqst to http://localhost:8000/auth/signin with request body {"username": "ubaid", "password": "1234"}
 - Then use this token, you can check the following URLs
 - you can check okta config using http://localhost:8000/auth/okta
 - currently I have configured OKTA with my username 

 ### URLs
- http://localhost:8000/app/employee/1
- http://localhost:8000/app/employee
