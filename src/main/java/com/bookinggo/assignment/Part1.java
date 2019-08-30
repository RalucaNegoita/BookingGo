package com.bookinggo.assignment;

import java.net.*;
import java.util.ArrayList;

public class Part1 {

    public static void main( String args[] ) throws Exception {
        Search search = new Search();

        if( !validArguments( args ) ) {
            System.err.println( "Incorrect args format" );
            return;
        }

        int noOfPassengers = 1;

        if( args.length == 5 )
            noOfPassengers = Integer.valueOf(args[4]);

        URL daveUrl = new URL( constructURL(args, "dave") );
        ApiResponse daveApiResponse = search.makeApiCall( daveUrl );
        if( daveApiResponse == null ) {
            System.err.print("Skipped supplier Dave ");
        }
        else {
            search.getRides(daveApiResponse, noOfPassengers);
        }

        URL ericUrl = new URL(constructURL(args, "eric"));
        ApiResponse ericApiResponse = search.makeApiCall(ericUrl);
        if( ericApiResponse == null ){
            System.err.print("Skipped supplier Eric ");
        }
        else {
            search.getRides(ericApiResponse, noOfPassengers);
        }

        URL jeffUrl = new URL( constructURL(args, "jeff") );
        ApiResponse jeffApiResponse = search.makeApiCall(jeffUrl);
        if( jeffApiResponse == null )
        {
            System.err.println("- skipped supplier Jeff ");
        }
        else {
            search.getRides(jeffApiResponse, noOfPassengers);
        }

        ArrayList<CarType> finalList = new ArrayList<>();

        for( String carType : search.getMap().keySet() ) {
            finalList.add(search.getMap().get(carType));
        }

        finalList.sort( new SortRidesInDescendingPriceOrder() );

        for( int i = 0; i < finalList.size(); i++ ) {
            System.out.println(finalList.get( i ));
        }
    }

    public static String constructURL( String args[], String supplier ) {

        StringBuilder stringBuilder = new StringBuilder("https://techtest.rideways.com/");

        stringBuilder.append( supplier );
        stringBuilder.append( "/" );

        stringBuilder.append( "?pickup=" );
        double latitude1 = Double.valueOf(args[0]);
        stringBuilder.append(latitude1);
        stringBuilder.append(",");
        double longitude1 = Double.valueOf(args[1]);
        stringBuilder.append(longitude1);

        stringBuilder.append("&dropoff=");
        double latitude2 = Double.valueOf(args[2]);
        stringBuilder.append(latitude2);
        stringBuilder.append(",");
        double longitude2 = Double.valueOf(args[3]);
        stringBuilder.append(longitude2);

        return stringBuilder.toString();
    }

    public static boolean validArguments(String[] args) {
        if( args.length < 4 || args.length > 5 )
            return false;

        if( args.length == 5 ) {
            if ( Integer.parseInt(args[4]) <= 0 ) {
                return false;
            }
        }

        if ( !checkDouble(args[0]) || !checkDouble(args[1] ) ||
                !checkDouble(args[2]) || !checkDouble(args[3] ))
            return false;

        return true;
    }

    public static boolean checkDouble( String toCheck ) {
        try {
            Double.valueOf(toCheck);
            return true;

        } catch (Exception ex) {
            return false;
        }
    }
}
