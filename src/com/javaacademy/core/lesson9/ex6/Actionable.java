package com.javaacademy.core.lesson9.ex6;

public abstract class Actionable {
    private String name;

    public Actionable(String name) {
        this.name = name;
    }

    public abstract void run(Actionable actionable);
    public abstract void voice();
    public abstract void sleeps();

    public String getName() {
        return name;
    }
}
