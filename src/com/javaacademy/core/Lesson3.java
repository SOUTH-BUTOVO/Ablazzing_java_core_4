package com.javaacademy.core;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        // Список студентов на курсе
        String[] students = new String[3];
        students[0] = "Сидоров";
        students[1] = "Иванов";
        students[2] = "Петров";

        System.out.println(students[0]);
        System.out.println(Arrays.toString(students).toUpperCase());
        System.out.println(students[0].length() + "\n" +
                           students[1].toUpperCase() + "\n" +
                           students[2].length());
        System.out.println("----------------------");
        for (String student : students) {
            System.out.println(student);
        }

        Object[] mass = {123, 123.123, "одинДВАтри"};
        for (Object o : mass) {
            System.out.print(o + " |");
        }
        System.out.println("----------------------");

        students[2] = "Козлов";
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------");
        char[] str = {'S', 'e', 'r', 'g', 'e', 'y'};
        System.out.println(str);

        double[] orders = {2.5, 1.5, 2, 2};
        double sum = 0;
        for (double order : orders) {
            sum += order;
        }
        System.out.println("Сумма заказа: " + sum);

        int[] roulette = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int i : roulette) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n----------------------");

        int count = 0;
        for (int i : roulette) {
            if (count < 6) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n----------------------");

        int[] rouletteResult = {36, 5, 10, 12, 1, 2, 7, 8};

        int sumLost = 0;
        for (int i = rouletteResult.length - 5; i < rouletteResult.length; i++) {
             sumLost += rouletteResult[i];
        }
        System.out.println(sumLost);
        System.out.println("----------------------");

        int countNum = 1;
        int sum2 = 0;
        while (countNum <= 10) {
            sum2 += countNum;
            countNum++;
        }
        System.out.println(sum2);
        System.out.println("----------------------");

        int[] day1 = {36, 2, 10, 17, 7};
        int[] day2 = {3, 5, 2, 9, 11};
        int[] day3 = {6, 15, 21, 33, 0};
        int[][] daysStatistics = new int[3][];
        daysStatistics[0] = day1;
        daysStatistics[1] = day2;
        daysStatistics[2] = day3;
        int[][] daysStatistics2 = {day1, day2, day3};

        int count2 = 0;
        for (int[] daysStatistic : daysStatistics2) {
            for (int num : daysStatistic) {
                if (count2 % 5 == 0) {
                    System.out.println();
                }
                count2++;
                System.out.print(num + " ");
            }
        }
        System.out.println("\n----------------------");

        for (int[] day : daysStatistics2) {
            System.out.println(Arrays.toString(day));
        }

        for (int[] daysStatistic : daysStatistics) {
            for (int i : daysStatistic) {
                if (i == 9) {
                    System.out.println("Нашли цифру! " + i);
                    return;
                } else {
                    System.out.println("Искомой цифры нет");
                }
            }
        }
        System.out.println("----------------------");
    }
}
