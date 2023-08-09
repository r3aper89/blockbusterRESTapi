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
Member(int id, String name, int videoId)

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
Goal use a response entity on the Dto class

## task 1
- ✅increment videoId and id automatically
  
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

- ✅member will rent a movie and return it.(PUT)
  - PUT /members/{id} videoId
  - PUT /videos/{id} status


## reference videos
orileys course master jave web; chapter 6 steps 8-14.

# Step 4 
add swagger

## tasks 0
add swagger to Pom.xml

- springdoc <https://springdoc.org>
- copy step 2 into pom.xml

localhost:8091/swagger-ui/index.html

## resources
ch6st17

# step 5 
branch dao
I. Implement doa and replace service hardcoding with hardcoding in dao

/controller
The entry points for HTTP requests to your application.
    // list all videos
    @GetMapping("/videos")
    // get vid by id
    @GetMapping("/videos/{id}")
    // delete by id
    @DeleteMapping("/videos/{id}")
    // add new video
    // POST {title:"...", status"..."} videoId will auto generate
    @PostMapping("/videos")
    // update video status
    // PUT {status:"..."} change the video status
    @PutMapping("/videos/{id}")

/dto
DTOs (Data Transfer Objects): These are used to transfer data between processes or across network connections.

- member.java
```java
public class MemberDto {
    // variables
    private Integer id;
    private String name;
    private Integer videoId;
}
```

- video.java

```java
public class VideoDto {
    // variables
    private Integer videoId;
    private String title;
    private String status;
}
```

/service
A Service in a Spring application is a class where business logic is implemented. It takes requests from controllers, interacts with the repository to fulfill those requests, and returns the results. Service classes are often where transactions are managed.



/dao
aka repositories dao data acess objects
DAO is a pattern that provides an abstract interface to a database or other forms of persistent storage. In the context of an application, DAO works as a bridge between the application and the database, providing CRUD (Create, Read, Update, Delete) operations without exposing details of the database. Each DAO interface corresponds to a single table in the database.

the business logic and call methods.
// get all videos
findAllVideos()
// get video by id
findVideoById(int id)
// delete video by id
public void deleteVideoById(int id)
// update video status
public VideoDto changeVideoStatus(Integer id, String status)




## task 0
split Dao and service layer.

## task 1
change the Dao to the data service layer.

## task 2

## refernces
ch7st4
-need to use JDBC in the DAO to comunicate with the DB

ch8st28
-config h2 db
-add data into db




ch8st30 DA
-Entity with Many-to-One Relationship




# step 6
Use JPA to design entities and replace dao hardcoding with jpa repositories

/repositories
repalce DAO
Repositories: In Spring Boot, repositories are the mechanism for encapsulating storage, retrieval, and search behavior, typically from a relational database. They're like a bridge between the service layer and the database. Spring Data JPA provides a way to define these as interfaces, reducing a lot of boilerplate code.

/Service
The service layer in a Spring Boot application is where the main business logic resides. Services often use repositories to get data, perform computations or operations on it, and then either return the result or save it back using the repositories.

/Entities
An entity represents a table in a database, and each instance of an entity represents a row in the table. An entity contains fields that map directly to the columns of the table. Entities are used to persist data in the database and retrieve data from it.


## task 0
add database

## task 1
add lombok

## task 2
get rented movies by usr
get movies rented list
get movies avalable list

## task 3
add time counter for rented films


## references
ch8st29
-jpa repositoy


ch8st31-get
ch8st32-post



user can many video_id's

