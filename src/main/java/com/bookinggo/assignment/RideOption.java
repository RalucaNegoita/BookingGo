package com.bookinggo.assignment;

public class RideOption {

    private String car_type;
    private int price;

    public String getCarType() {
        return car_type;
    }

    public String setCarType( String carType ) {
        return this.car_type = car_type;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice( int price ) {
        return this.price = price;
    }

    @Override
    public String toString() {
        return "(" + car_type + "," + price + ")";
    }
}
