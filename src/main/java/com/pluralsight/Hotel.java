package com.pluralsight;

public class Hotel {
private String name;
private int numberOfSuites;
private int numberOfRooms;
private int bookedSuites = 0;
private int bookedBasicRooms = 0;

    public String getName() {
        return this.name;
    }
    public int getNumberOfSuites() {
        return this.numberOfSuites;
    }
    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }
    public int getBookedSuites() {
        return this.bookedSuites;
    }
    public int getBookedBasicRooms() {
        return this.bookedBasicRooms;
    }

    Hotel(String name, int numberOfSuites, int numberOfRooms) {

    }
    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {

    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        return isSuite;
    }
    public void getAvailableSuites() {

    }
    public void getAvailableRooms() {

    }
}
