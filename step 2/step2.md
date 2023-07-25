# setup project – setup project (make sure it builds)

document the steps taken to setup the project.
step 2 mirrors principles from orileys course master jave web; chapter 6 steps 1-8


## task 1
use springboot initializer (website) to create a project
https://start.spring.io

select the following:
Project: Maven
language: java
Spring Boot: 3.1.1
Project Metadata:
- group com.example.videostore.blockbuster
- artifact: blockbuster
- name: blockbuster
- description: Blockbuster video store
- package name: com.example.videostore.blockbuster
- java: 17
- packaging: jar
dependencies:
- spring web
- spring data jpa
- h2 database
- spring boot devtools

## task 2 
this section is basic version of the project.

controller: takes care of or end points

DAO Pattern: DAO stands for data access object. Usually, the DAO class is responsible for two concepts: encapsulating the details of the persistence layer and providing a CRUD interface for a single entity.


# reference video
<https://learning.oreilly.com/videos/master-java-web/9781789130133/9781789130133-video6_9/>
chapter 6 / steps 1-8
