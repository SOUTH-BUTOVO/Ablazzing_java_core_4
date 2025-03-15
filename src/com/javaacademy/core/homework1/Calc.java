package com.javaacademy.core.homework1;

import java.util.Scanner;

public class Calc {
    Scanner scanner = new Scanner(System.in);

    public void calc() {
        System.out.println("Введите первое число:");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите знак операции: \"+\", \"-\", \"*\", \"/\" ");
        String operand = scanner.nextLine();

        System.out.println("Введите второе число:");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Результат операции = ");
        System.out.println(operand.equals("+") ? num1 + num2 :
                           operand.equals("-") ? num1 - num2 :
                           operand.equals("*") ? num1 * num2 :
                           operand.equals("/") ? num1 / num2 : "Ошибка! Не правильный операнд");
        scanner.close();
    }
}
