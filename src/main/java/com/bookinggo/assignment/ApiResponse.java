package com.bookinggo.assignment;

import java.util.ArrayList;

public class ApiResponse {

    private String supplier_id;
    private String pickup;
    private String dropoff;
    private ArrayList<RideOption> options = null;


    public String getSupplierId() {

        return supplier_id;
    }

    public void setSupplierId(String id) {

        this.supplier_id = supplier_id;
    }

    public String getPickup() {

        return pickup;
    }

    public void setPickup( String pickup) {
         this.pickup = pickup;
    }

    public String getDropoff() {

        return dropoff;
    }

    public void setDropoff( String pickup) {
         this.dropoff = dropoff;
    }

    public ArrayList<RideOption>getRideOptions() {
        return options;
    }

    public void setRideOptions( ArrayList<RideOption> options ) {
        this.options = options;
    }

    @Override
    public String toString() {
        return supplier_id + "  " + pickup + "  " + dropoff + "  " + options;
    }


}
