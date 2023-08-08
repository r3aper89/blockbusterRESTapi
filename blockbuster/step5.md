creating a CRUD (Create, Read, Update, Delete) RestAPI for a single database table 

layers

/controller
endpoints:

- Create (HTTP POST):
  - Endpoint: `/members`
  - Description: Allows the user to create a new member by providing the `name` and `videoId` in the request body.
  - Response: Returns the created member with its unique `id`.

  - Read (HTTP GET):
    - Endpoint: `/members/`
    - Description: Retrieves the details of all member by providing its unique `id`.
    - Response: Returns the member's details (including `name`, `videoId`, and `id`) if it exists, or an appropriate error message if not found.

  - Read (HTTP GET):
    - Endpoint: `/members/:id`
    - Description: Retrieves the details of a specific member by providing its unique `id`.
    - Response: Returns the member's details (including `name`, `videoId`, and `id`) if it exists, or an appropriate error message if not found.

  - Update (HTTP PUT or PATCH):
    - Endpoint: `/members/:id`
    - Description: Allows the user to update an existing member's `name` and/or `videoId` by providing the updated values in the request body. The `id` should remain unchanged.
    - Response: Returns the updated member.

  - Delete (HTTP DELETE):
    - Endpoint: `/members/:id`
    - Description: Deletes an member with the provided `id`.
    - Response: Returns a success message or an appropriate error message if the member doesn't exist.


/dto

/service

/adapter

/dao

/entity

/exceptions








/repository





