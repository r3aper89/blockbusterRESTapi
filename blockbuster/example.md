example of dao, service, dto and controller working together not using the jdbcTemplate

Sure, let's extend the previous example with a DTO (Data Transfer Object). DTOs are often used in Spring applications to define the data sent over the network.

Let's assume we have a `UserDTO` that contains a subset of the data from the `User` entity:

```java
public class UserDTO {
    
    private Long id;
    private String email;

    // Getters and Setters...
}
```

**DAO (Data Access Object)**:

```java
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
}
```

**Service**:

The service layer fetches the `User` from the DAO and then maps it to a `UserDTO`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public UserDTO findUserById(Long id) {
        User user = userDao.findById(id);
        return user != null ? mapToDTO(user) : null;
    }

    private UserDTO mapToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
```

**Controller**:

The controller returns a `UserDTO` instead of a `User`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        UserDTO userDTO = userService.findUserById(id);
        if (userDTO == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTO);
        }
    }
}
```

In this example, the `UserController` handles incoming HTTP requests, `UserService` contains business logic and calls `UserDao` to interact with the database, and the data fetched from the database is transferred as a `UserDTO`. Using DTOs can improve performance and security by ensuring that only the necessary data is sent over the network, and any sensitive or unnecessary fields are omitted.

In a real-world application, the mapping between entities and DTOs is often handled using a library like ModelMapper or MapStruct, and there would likely be more error handling and logging.
