#BookingGO rides assignment
This is a maven project developed using SpringBoot.

System requirements: 
* Jdk8
* Maven 3.8

To compile:

`mvnw clean compile assembly:single`

To run:

Part 1:

`java -cp target\assignment-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.bookinggo.assignment.Part1 [pickup latitude] [pickup longitude] [dropoff latitude] [dropoff longitude] [number of passengers]`
* [pickup latitude] is replaced by pickup latitude coordinates
* [pickup longitude] is replaced by pickup longitude coordinates
* [dropoff latitude] is replaced by dropoff latitude coordinates
* [dropoff longitude] is replaced by dropoff longitude coordinates


//To build and run tests: 

//`mvnw clean install`
