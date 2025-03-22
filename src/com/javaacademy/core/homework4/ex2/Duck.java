package com.javaacademy.core.homework4.ex2;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Уточка ранена и не может лететь.");
        }
        System.out.println("Уточка летит!");
    }
}
