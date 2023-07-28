# springboot-blockbuster

This project is a springboot project that simulates a BlockBuster video store. where members can rent a movie and return it.

The project is divided into small steps. Below you can find the steps and the description of each step. Each step is saved as a git branch, switch branch to see the progress of each step.

# Step 1

## Description

The following springboot project simulates a BlockBuster video store.
where a member can rent a movie and return it.

## Database

The database is a simple database with two tables.
the movies database will have all the videos and show if they are available or rented.
the members database will have all the members and the video_id of the movie they're renting.

/videos
| id  | title                             | status    |
| --- | --------------------------------- | --------- |
| 1   | Madagascar                        | available |
| 2   | Madagascar: Escape 2 Africa       | rented    |
| 3   | Madagascar 3: Europes Most Wanted | available |
| 4   | Madly Madagascar                  | available |
| 5   | Penguins of Madagascar            | rented    |

/members
| id  | name  | video_id |
| --- | ----- | -------- |
| 1   | james | 5        |
| 2   | tim   | 2        |

## scenario

the scenario will demonstrate CRUD principles.

- create new member 'troy'. (POST)
- member checks available movies. (GET)
- member will rent a movie and return it.(PUT)
  - movie/status: from available to rented.
  - member/video_id: from null to video_id.
- member will cancel membership. (DELETE)

# STEP 2
sets up a basic spring boot project with the following layers controller, dto, and services.

## task 1

use springboot initializer (website) to create a project
<https://start.spring.io>

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

## test
localhost:8091/videos
-returns json of all the videos

localhost:8091/members
-returns json of all mebers


## reference videos
orileys course master jave web; chapter 6 steps 1-8.
<https://learning.oreilly.com/videos/master-java-web/9781789130133/9781789130133-video6_9/>


# Step 3
Goal use ResponseEntity<dtoClass> on the Dto class.
/controller/*.java
@PostMapping

## task 1
- ✅increment videoId and memberId automatically
  
- ✅list all member or videos
  - GET /members
  - GET /videos

- ✅find a member or video by id
  - GET /videos/{id}
  - GET /members/{id}

- ✅using post api add a new member and video (uses Response entity)
  - POST /videos
  - POST /members
  
- ✅delete a specific member and video by id
  - DELETE /members/{id}
  - DELETE /videos/{id}

- member will rent a movie and return it.(PUT)
  - video/status: from available to rented.
  - member/video_id: from null to video_id.

## reference videos
orileys course master jave web; chapter 6 steps 8-14.

# Step 4 
add swagger to pom.xml

-update pom.xml


# step 5
seperate teh service and DOA layer 
/service
/DAO

# step 6
/resouces
  /data
