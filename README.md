#BookingGO rides assignment
This is a maven project developed using SpringBoot.

System requirements: 
* Jdk8
* Maven 3.8

To compile PART 1:

`mvnw clean compile assembly:single`

To run PART 1:

`java -cp target\assignment-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.bookinggo.assignment.Part1 [pickup latitude] [pickup longitude] [dropoff latitude] [dropoff longitude] [number of passengers]`
* [pickup latitude] is replaced by pickup latitude coordinates
* [pickup longitude] is replaced by pickup longitude coordinates
* [dropoff latitude] is replaced by dropoff latitude coordinates
* [dropoff longitude] is replaced by dropoff longitude coordinates


To compile PART 2:

`mvnw clean spring-boot:run`


* Failed to execute CommandLineRunner: 400 null 

The code for the RESTful API is all there but gives a 400 Error when compiling.