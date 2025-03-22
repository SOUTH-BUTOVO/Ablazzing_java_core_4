package com.javaacademy.core.homework4.ex4darwin.animals;

public abstract class Live {
    protected String name;
    protected double weight;
    protected boolean alive = true;

    public Live(double weight) {
        this.weight = weight;
    }

    public void notAlive() {
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Live{" + "name='" + name + '\'' + ", weight=" + weight + ", alive=" + alive + '}';
    }
}
