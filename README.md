#BookingGO rides assignment
This is a maven project developed using SpringBoot.

System requirements: 
* Jdk8

To build and run tests: 

//`mvnw clean install`

`mvnw clean compile assembly:single`

To run the web server:

`java -jar target/*.jar`

To run the program:

`java -cp target\BookingGoTest-0.0.1-SNAPSHOT-jar-with-dependencies.jar Search.Part1 [pickup latitude] [pickup longitude] [dropoff latitude] [dropoff latitude]`

Part 1:
a)
`java -cp target\assignment-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.bookinggo.assignment.Part1 "51.470020" "-0.454295" "51.00000" "1.0000"`

b)
`java -cp target\assignment-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.bookinggo.assignment.Part1 "51.470020" "-0.454295" "51.00000" "1.0000" 4`
