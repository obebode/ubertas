The Challenge...

In a language of your choice, create a REST API which displays ISO codes for a given country, for example:
curl --header "Accept: application/json" http://127.0.0.1:5000/api/v1/countries?name=Spain - this would return “ES”
curl --header "Accept: application/json" http://127.0.0.1:5000/api/v1/countries?name=UK  - this would return “GB”
Repeat for four countries.
UK returns GB
Spain returns ES
Ireland returns IE
France returns FR
Once the application has been written, package this up into a re-deployable app.

**Solution** 

Programming language - Java 8, Spring Boot 2.0.0.Release and Hibernate
Database - Postgresql 9.6.1

**To run the project** 

You will need to have the above installed and insert into the following your PostgreSQL;

* spring.datasource.username= ""
* spring.datasource.password= ""
* spring.datasource.driverClassName=org.postgresql.Driver
* spring.datasource.url=""

Load the the database with the data in the SQL file of the project directory

**To run the project**

* mvn spring-boot:run

* Specify the environment if your have two different environmments, for example, local and prod;

* mvn spring-boot:run -Dspring.profiles.active=prod
* mvn spring-boot:run -Dspring.profiles.active=local

**Endpoints;** 
If you running directly on you local machine with database installed locally;
http://127.0.0.1:5000/api/v1/countries?name=Spain

You can also; 
*curl --header "Accept: application/json" http://127.0.0.1:5000/api/v1/countries?name=Spain 

**You can package the app with the following command;**

* mvn clean package -Dspring.profiles.active=local or 
* mvn clean package -Dspring.profiles.active=prod 
but for prod; the server.address will be the internal IP address of the EC2 instance that the app will be deployed to.

If deployed local machine, you should be able to do this;
* http://127.0.0.1:5000/api/v1/countries?name=Spain

If deployed on AWS ec2 instance, you should be able to do this;
* http://Private IP of the EC2 instance/api/v1/countries?name=Spain

Note: You will also need to load the test data into the database instance in AWS
