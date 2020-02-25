# person-info-service
### Port Info
- 9000
### URLs 
- ##### for one person
    - http://localhost:9000/person-info-service/person/1
- ##### for all persons
    - http://localhost:9000/person-info-service/person

### Errors
- #### No serializer found for class org.hibernate.proxy.pojo.javassist.Javassist?
    - Solution: Add @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) on your entity
    - Cause: Hibernate is serializing internal stuff 
    - Link: https://hibernate.atlassian.net/browse/OGM-641?page=com.atlassian.jira.plugin.system.issuetabpanels%3Aall-tabpanel

# naming server
### Port Info
- 8761
### URLS 
- http://localhost:8761

# API Gateway Server
### Port Info
- 8111

# Employee Info Service
### Port Info
- 9500
### URLs
- http://localhost:9500/employee/1
- http://localhost:9500/employee
