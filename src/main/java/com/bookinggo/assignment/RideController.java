package com.bookinggo.assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RideController {

    @RequestMapping("/bookinggo")

    public String ride(@RequestParam(value="pickup") String pickup,
                           @RequestParam(value="dropoff") String dropoff,
                           @RequestParam(required = false) String noOfPassengers) throws Exception {
        try {
            if (!checkPassangers( noOfPassengers )) {
                return " Invalid  number of passengers ";
            }

            Search search = new Search();

            URL daveUrl = new URL(constructURL("dave", pickup, dropoff, noOfPassengers));
            ApiResponse daveApiResponse = search.makeApiCall(daveUrl);

            if (daveApiResponse != null)
                search.getRides(daveApiResponse, Integer.valueOf(noOfPassengers));



            URL ericUrl = new URL(constructURL("eric", pickup, dropoff, noOfPassengers));
            ApiResponse ericApiResponse = search.makeApiCall(ericUrl);

            if (ericApiResponse != null)
                search.getRides(ericApiResponse, Integer.valueOf(noOfPassengers));



            URL jeffUrl = new URL(constructURL("jeff", pickup, dropoff, noOfPassengers));
            ApiResponse jeffApiResponse = search.makeApiCall(jeffUrl);

            if (jeffApiResponse != null)
                search.getRides(jeffApiResponse, Integer.valueOf(noOfPassengers));


            ArrayList<CarType> finalList;
            finalList = new ArrayList<>();

            for (String carType : search.getMap().keySet()) {
                finalList.add( search.getMap().get(carType) );
            }

            finalList.sort(new SortRidesInDescendingPriceOrder());

            return new Gson().toJson( finalList );
        } catch (MalformedURLException e) {
            return "Incorrect format of param. Correct format : 1.2345,6.7890";
        }

    }
    private String constructURL( String supplier, String pickup, String dropoff, String passengeres ) {
        StringBuilder stringBuilder = new StringBuilder("https://techtest.rideways.com/");

        if ( !checkLocation( pickup ) || !checkLocation( dropoff ) ) {
            return null;
        }

        stringBuilder.append( supplier );
        stringBuilder.append( "/" );

        stringBuilder.append( "?pickup=" );
        stringBuilder.append( pickup );

        stringBuilder.append( "&dropoff=" );
        stringBuilder.append( dropoff );

        return stringBuilder.toString();
    }

    private boolean checkPassangers( String passengers ) {
        try {
            int noOfPassengers = Integer.valueOf( passengers );

            if ( noOfPassengers <= 0 )
                return false;

            return true;
        } catch ( Exception ex ) {
            return false;
        }
    }

    private boolean checkLocation( String location ) {
        try{
            String[] coordinates = location.split("," );

            Double.valueOf( coordinates[0] );
            Double.valueOf( coordinates[1] );

            return true;
        }
        catch ( Exception ex ){
            return false;
        }
    }
}