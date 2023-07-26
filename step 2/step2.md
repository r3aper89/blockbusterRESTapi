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
create the /controller, /dto, and /services classes/layers.

/controller
the controller class creates paths to localhost/members and localhost/videos areas each return a json object listing all the videos and members in from the service class.

/dto
the DTO (data transfer object) class houses schema objects for the table. 
Video(int videoId, String title, String status)
Member(int memberId, String name, int videoId)

/services
the services class is a combination of the DAO and service layer.
this layer also houses the data for the database.

DAO (Data Access Object) houses a list of operations that interacts with the data such as CRUD operations.
The service layer, references the DAO to access the data and implements business logic according to the business rules (for example, checking if a book already exists before trying to add it).


# reference videos
<https://learning.oreilly.com/videos/master-java-web/9781789130133/9781789130133-video6_9/>
chapter 6 / steps 1-8


