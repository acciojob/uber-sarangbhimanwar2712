package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "tripBooking")
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId ;
    private String fromLocation ;
    private String toLcation ;
    private int distanceInKm ;
    private TripStatus tripStatus ;

    private int bill ;

    //TripBooking is child wrt driver
    @ManyToOne
    @JoinColumn
    private Driver driver ;

    //TripBooking is child wrt customer
    @ManyToOne
    @JoinColumn
    private Customer customer ;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public TripBooking() {
    }

    public TripBooking(int tripBookingId, String fromLocation, String toLcation, int distanceInKm, TripStatus tripStatus, int bill) {
        this.tripBookingId = tripBookingId;
        this.fromLocation = fromLocation;
        this.toLcation = toLcation;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
        this.bill = bill;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLcation() {
        return toLcation;
    }

    public void setToLcation(String toLcation) {
        this.toLcation = toLcation;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}