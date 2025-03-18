package com.javaacademy.core.homework2.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void getToWork(Manager manager) {
        System.out.println(manager.getName() + " быстрее");
    }

    public String getName() {
        return name;
    }
}
