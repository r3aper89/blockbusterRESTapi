# springboot-blockbuster

## Step 1: describe
### Description
The following springboot project simulates a BlockBuster video store.
where a member can rent a movie and return it.

### Database 
The database is a simple database with two tables.
the videos database will have all the videos and show if they are available or rented.
the members database will have all the members and the video_id of the movie they're renting.

## Step 2 – branch setup project (make sure it builds)
use springboot initializer (website) to create a project.
add folders (repository, entities, services, controllers, dtos, adapters).
on github add branches for each step.

## step 3 – branch dto design all dtos

## Step 4 - branch add controllers with swagger using dtos
- Service layer added with di which returns hardcoded responses (check it build and works with swagger)

## Step 5 – branch dao
- Implement doa and replace service hardcoding with hardcoding in dao

## Step 6 – branch database
- Use JPA to design entities 
ii. Replace dao hardcoding with jpa repositories

# resources
Master Java Web Services and REST API with Spring Boot
https://learning.oreilly.com/videos/master-java-web/

https://github.com/packtpublishing/master-java-web-services-and-rest-api-with-spring-boot