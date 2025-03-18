package com.javaacademy.core.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        int a = 2_147_483_647;
        int b = 2_141_483_647;
        char c = 188;
        System.out.println(a);
        System.out.println(c);
        String[] i = new String[1];
        String name = "Yuri";
        System.out.println(name);
        //String str = "\n".repeat(50);
        System.out.print("\n".repeat(5));
        System.out.println(name.substring(1));

        String textWithBlanks = "     это   текст     с пробелами   ещё текст   ";
        String textWithoutBlanks = textWithBlanks
                .trim()
                .replaceAll(" +", " ");
        System.out.println(textWithoutBlanks);
    }
}
