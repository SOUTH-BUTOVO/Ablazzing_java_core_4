package com.javaacademy.core.lesson7.shoes_factory_ex1;

public enum Country {
    RUSSIA("Россия"), BELARUS("Беларуссия"), FRANCE("France"), GERMANY("Germany");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
