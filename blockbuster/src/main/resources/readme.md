
<https://www.baeldung.com/spring-boot-data-sql-and-schema-sql>

# data.sql 
inserts data into the database using SQL.

```sql
insert into members (id, memberName, videoId)
values (1, 'James', '5');
```



# schema.sql
by default, Hibernate automatically creates the schema to use the schema.sql File
spring.jpa.hibernate.ddl-auto=none

This will ensure that only script-based schema generation is performed using schema.sql.

If we still want to have both Hibernate automatic schema generation in conjugation with script-based schema creation and data population, we'll have to use:

spring.jpa.defer-datasource-initialization=true
This will ensure that after Hibernate schema creation is performed, then additionally schema.sql is read for any additional schema changes, and further data.sql is executed to populate the database.

Also, as explained in the previous section, script-based initialization is performed by default only for embedded databases. To always initialize a database using scripts, we'll have to use:

spring.sql.init.mode=always

```sql
create table USERS(
  ID int not null AUTO_INCREMENT,
  NAME varchar(100) not null,
  STATUS int,
  PRIMARY KEY ( ID )
);
```