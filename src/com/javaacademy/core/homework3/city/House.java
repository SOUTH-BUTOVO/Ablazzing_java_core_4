package com.javaacademy.core.homework3.city;

public final class House {
    private String streetName; // наименование улицы
    private int houseNumber; // номер дома

    public House(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{" + "наименование улицы: " + streetName + '\'' + ", номер дома: " + houseNumber + '}';
    }
}
