package com.javaacademy.core.lesson7.shoes_factory_ex1;

public class Factory {
    private Country country;

    public Factory(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Factory{" + "country=" + country.getName() + '}';
    }
}
