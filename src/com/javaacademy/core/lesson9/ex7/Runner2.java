package com.javaacademy.core.lesson9.ex7;

public class Runner2 {
    public static void main(String[] args) {

        prtRecursion("ABCDE");
    }

    public static void prtRecursion(String text) {
        System.out.println(text);
        if (!text.isEmpty()) {
            prtRecursion(text.substring(0, text.length() - 1));
        }
    }
}
