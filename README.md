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

# reference videos

step 2 mirrors principles from orileys course master jave web; chapter 6 steps 1-8.
<https://learning.oreilly.com/videos/master-java-web/9781789130133/9781789130133-video6_9/>


## step 3 – dto design all dtos

design all dtos for the project.

## Step 4 - add controllers with swagger using dtos

Service layer added which returns hardcoded responses (check it build and works with swagger)

## Step 5 – dao

Implement doa and replace service hardcoding with hardcoding in dao

## Step 6 – database

Use JPA to design entities and replace dao hardcoding with jpa repositories

# resources

Master Java Web Services and REST API with Spring Boot

<https://learning.oreilly.com/videos/master-java-web/>

git repo
<https://github.com/packtpublishing/master-java-web-services-and-rest-api-with-spring-boot>
