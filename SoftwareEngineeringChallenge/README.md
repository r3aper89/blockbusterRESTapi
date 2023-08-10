# CRUD RestAPI Software Engineering Challenge

## Introduction

The following presents an example of a CRUD (Create, Read, Update, Delete) RestAPI for a single database table. This example adheres to best practices in code organization, utilizing layers such as adaptor, controller, DTO, entity, service, and repository. Swagger is used to explain and demonstrate the RestAPI, highlighting the endpoints and the expected request and response formats.

### DB TABLE:

The table fields:

- `id` (unique identifier for each record)
- `name` (string, representing the name of an item)
- `description` (string, providing additional information about the item)

### /endpoints:

- **Create** (HTTP POST):
  
  - Endpoint: `/items`
  - Description: Allows the user to create a new item by providing the `name` and `description` in the request body.
  - Response: Returns the created item with its unique `id`.

- **Read** (HTTP GET):
  
  - Endpoint: `/items/:id`
  - Description: Retrieves the details of a specific item by providing its unique `id`.
  - Response: Returns the item's details (including `name`, `description`, and `id`) if it exists, or an appropriate error message if not found.

- **Update** (HTTP PUT or PATCH):
  - Endpoint: `/items/:id`
  - Description: Allows the user to update an existing item's `name` and/or `description` by providing the updated values in the request body. The `id` should remain unchanged.
  - Response: Returns the updated item.

- **Delete** (HTTP DELETE):
  - Endpoint: `/items/:id`
  - Description: Deletes an item with the provided `id`.
  - Response: Returns a success message or an appropriate error message if the item doesn't exist.

### Links

[Swagger UI](http://localhost:8080/swagger-ui/index.html)

[H2 Console](http://localhost:8080/h2-console/)


