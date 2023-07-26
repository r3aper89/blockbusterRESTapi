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


## Step 2 – setup project (make sure it builds)
use springboot initializer (website) to create a project.
add folders (repository, entities, services, controllers, dtos, adapters).
on github add branches for each step.
make sure the project builds.

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
https://learning.oreilly.com/videos/master-java-web/

https://github.com/packtpublishing/master-java-web-services-and-rest-api-with-spring-boot