package com.javaacademy.core.lesson8;

public class Runner {

    private static void calc(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        try {
            calc(1, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Следующая операция");

//        System.out.println(2 / 0);

        try {
            String name = null;
            name.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
