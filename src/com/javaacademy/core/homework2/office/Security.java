package com.javaacademy.core.homework2.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public void giveMyMany() {
        System.out.println("Дайте мне аванс");
    }

    public String getName() {
        return name;
    }
}
