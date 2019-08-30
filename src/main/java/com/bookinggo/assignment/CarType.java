package com.bookinggo.assignment;

public class CarType {

    private String carType;
    private int price;
    private String supplier;
    private int nrOfPassangers;


    public CarType(String carType, int price, String supplier ) {
        this.carType = carType;
        this.price = price;
        this.supplier = supplier;
        setPassangers( carType );
    }

    private void setPassangers( String carType ) {
        switch( carType ) {
            case "STANDARD":

            case "EXECUTIVE":

            case "LUXURY":
                nrOfPassangers = 4;
                break;

            case "PEOPLE_CARRIER":

            case "LUXURY_PEOPLE_CARRIER":
                nrOfPassangers = 6;
                break;

            case "MINIBUS":
                nrOfPassangers = 16;
                break;
        }
    }

    public int getPrice() {
        return price;
    }

    public String getRideType() {
        return carType;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getPassangers() {
        return nrOfPassangers;
    }

    public String toString() {
        return carType + " - " + supplier + " - " + price;
    }
}