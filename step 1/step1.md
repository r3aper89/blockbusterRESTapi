# Step 1

## Description: 
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
