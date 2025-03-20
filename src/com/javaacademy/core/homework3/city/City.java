package com.javaacademy.core.homework3.city;

import java.util.Arrays;

public final class City {
    private final House[] houses;
    private final String nameOfTheCity; // наименование города

    public City(House[] houses, String nameOfTheCity) {
        this.houses = houses;
        this.nameOfTheCity = nameOfTheCity;
    }

    public House[] getHouses() {
        return houses;
    }

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    @Override
    public String toString() {
        return "City{" + "дом: " + Arrays.toString(houses) + ", имя города: " + nameOfTheCity + '\'' + '}';
    }
}
