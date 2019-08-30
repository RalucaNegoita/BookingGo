package com.bookinggo.assignment;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class Search {
    Map<String, CarType> orderedRides;

    public Search() {

        orderedRides = new HashMap<>();
    }

    public void getRides(ApiResponse apiResponse, int passengers) {
        for (RideOption option : apiResponse.getRideOptions()) {
            CarType carType = new CarType(option.getCarType(), option.getPrice(), apiResponse.getSupplierId());

            if ( passengers != 0 && carType.getPassangers() >= passengers ) {
                if (orderedRides.containsKey(carType.getRideType())) {
                    CarType prevCarType = orderedRides.get(carType.getRideType());

                    if (prevCarType.getPrice() > carType.getPrice())
                        orderedRides.put(carType.getRideType(), carType);
                }
                else orderedRides.put(carType.getRideType(), carType);
            }
        }
    }

    public ApiResponse makeApiCall(URL url) throws Exception {

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setConnectTimeout(2000);

        int responseStatus = con.getResponseCode();

        if (responseStatus != 200) {
            //System.err.println("Skipped supplier.");
            System.err.println();
            System.err.print("Error code " + responseStatus + " ");

            return null;
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String strRep = response.toString();
        ApiResponse apiResponse = gson.fromJson(strRep, ApiResponse.class);
        return apiResponse;
    }

    public Map<String, CarType> getMap() {
        return orderedRides;
    }
}