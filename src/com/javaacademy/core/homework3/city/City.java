package com.javaacademy.core.homework3.city;

import java.util.Arrays;

public final class City {
    private final House[] houses;
    private final String nameOfTheCity; // наименование города

    public City(House[] houses, String nameOfTheCity) {
        this.houses = houses;
        this.nameOfTheCity = nameOfTheCity;
    }

//    public House[] getHouses() {
//        return houses;
//    }

//    public House[] getHouses() {
//        House[] housesCopy = new House[houses.length];
//        for (int i = 0; i < houses.length; i++) {
//            House house = houses[i];
//            House copy = new House(house.getStreetName(), house.getHouseNumber());
//            housesCopy[i] = copy;
//        }
//        return housesCopy;
//    }

//    public House[] getHouses() {
//        try {
//            House[] housesCopy = new House[houses.length];
//            for (int i = 0; i < houses.length; i++) {
//                House house = houses[i];
//                House copy = (House) house.clone();
//                housesCopy[i] = copy;
//            }
//            return housesCopy;
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public House[] getHouses() {
        try {
            House[] housesCopy = new House[houses.length];
            for (int i = 0; i < houses.length; i++) {
                housesCopy[i] = (House) houses[i].clone();
            }
            return housesCopy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    @Override
    public String toString() {
        return "City{" + "дом: " + Arrays.toString(houses) + ", имя города: " + nameOfTheCity + '\'' + '}';
    }
}
