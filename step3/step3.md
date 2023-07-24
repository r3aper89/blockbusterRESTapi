# step 3 – branch dto design all dtos
- data transfer object
    - Just a class
    - ResponseEntity <DTOClass>
    - springboot will automatically serialise the dto to json

# dto design
![DTOExample](./attachments/dtoExample.png)





# resources

![Spring Boot DTO Example Tutorial | Data Transfer Object Pattern | Line By Line Coding ](https://www.youtube.com/watch?v=THv-TI1ZNMk)




# structure
|- src
    |- main
        |- java
            |- com
                |- example
                    |- blockbuster
                        |- controller
                            |- MemberController.java
                            |- VideoController.java
                        |- dto
                            |- MemberDto.java
                            |- VideoDto.java
                        |- model
                            |- Member.java
                            |- Video.java
                        |- service
                            |- MemberService.java
                            |- VideoService.java
        |- resources
            |- application.properties
|- pom.xml
