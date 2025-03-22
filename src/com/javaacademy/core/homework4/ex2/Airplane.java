package com.javaacademy.core.homework4.ex2;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Пассажиров меньше 0, самолёт не может лететь.");
        }
        System.out.println("Самолёт летит!");
    }
}
