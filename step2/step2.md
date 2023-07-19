# setup project – setup project (make sure it builds)

document the steps taken to setup the project.

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

add folders: repository, entities, services, controllers, dtos, adapters, model

## task 3

setup git branches: on github add branches for each step.

## task 4

make sure the project builds
RUN
blockbuster/src/main/java/com/example/videostore/blockbuster/BlockbusterApplication.java

# reference video

chapter 6 /

- Step 01 - Initializing a REST API Project with Spring Boot
- Step 06 - Designing the REST API for Social Media Application
