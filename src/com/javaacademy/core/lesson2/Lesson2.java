package com.javaacademy.core.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int money = 155;
        boolean isBlackBread = false;

        if (money > 100) {
            if (isBlackBread) {
                System.out.println("Покупаю дорогой чёрный хлеб");
            } else {
                System.out.println("Покупаю дорогой белый хлеб");
            }
        } else if (money > 50) {
            System.out.println("Покупаю обычный хлеб");
        } else {
            System.out.println("Покупаю дешёвый хлеб");
        }
        System.out.println("-----------------------------------");

        int money2 = 150;
        int breadPrice = 120;
        int waterPrice = 20;

        System.out.println(breadPrice >= 150 || waterPrice > 30 ? "Выхожу из магазина, магазин дорогой((" :
                           money2 >= breadPrice + waterPrice ? "Покупаю хлеб и воду" :
                           money2 >= breadPrice ? "Покупаю хлеб" :
                           money2 >= 20 ? "Покупаю воду" : "Нет денег, в магазин не иду");
    }
}
