package com.javaacademy.core.homework2.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Я ничего не успеваю, помогите!");
    }

    public String getName() {
        return name;
    }
}
