package com.bookinggo.assignment;
import java.util.Comparator;

public class SortRidesInDescendingPriceOrder implements Comparator<CarType> {
    public int compare(CarType r1, CarType r2) {
        return r1.getPrice() - r2.getPrice();
    }
}