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

    public String setSupplierId() {
        return this.supplier_id = supplier_id;
    }

    public String getPickup() {
        return pickup;
    }

    public String setPickup() {
        return this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public String setDropoff() {
        return this.dropoff = dropoff;
    }

    public ArrayList<RideOption>getRideOptions() {
        return options;
    }

    @Override
    public String toString() {
        return supplier_id + "  " + pickup + "  " + dropoff + "  " + options;
    }
}
