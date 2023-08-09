
Create a springboot project to satisfy the following requirements, and layers.

layers:
the project must use the following layers: controller, Dao, dto, entity, service, and adaptors. Use Lombok and jdbc repository dependencies.


requirements:
Implement the following endpoints:
- **Create** (HTTP POST):
  - Endpoint: `/members`
  - Description: Allows the user to create a new member by providing the `name`
  - Response: Returns the created item with its unique `id`.

- **Read** (HTTP GET):
  - Endpoint: `/members/id`
  - Description: Retrieves the details of a specific member by providing its unique `id`.
  - Response: Returns the member's details (including `name`, `videoId`, and `id`) if it exists, or an appropriate error message if not found.

- **Update** (HTTP PUT or PATCH):
  - Endpoint: `/members/id`
  - Description: Allows the user to update an existing member's `name` and/or `videoId` by providing the updated values in the request body. The `id` should remain unchanged.
  - Response: Returns the updated member.

- **Delete** (HTTP DELETE):
  - Endpoint: `/members/id`
  - Description: Deletes an item with the provided `id`.
  - Response: Returns a success message or an appropriate error message if the member doesn't exist.


sql members database
/members
| id  | name  | videoId |
| --- | ----- | ------- |
| 1   | james | 5       |
| 2   | tim   | 2       |
