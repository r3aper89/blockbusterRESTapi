

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/sql/init/DataSourceInitializationConfiguration.class]: Failed to execute SQL script statement #1 of file [/Volumes/DropBox/git/springboot-blockbuster-mini-project/blockbuster/target/classes/data.sql]: insert into members(id, name, videoId) values (1, 'James', 5)


no idea why jdbc wont load the comands into