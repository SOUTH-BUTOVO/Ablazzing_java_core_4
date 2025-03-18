package com.javaacademy.core.homework2;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    public static void massMeat(String[] words) {
        String str = Arrays.toString(words);
        String str2 = str.substring(2, str.length() - 2).replace("\", \"", "-");
        System.out.println(str2);

        String strCycle = "";
        for (String word : words) {
            strCycle += word.concat("-");
        }

        String strResult = strCycle.substring(0, strCycle.length() - 1).replace("\"", "");
        System.out.println(strResult);
    }

    public static void massNumeric(int[][] mass) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mass.length; i++) {
           sum1 += mass[i][i];
           sum2 += mass[i][(mass.length - 1) - i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static void generateNum() {
        Random random = new Random(1);


        int count = 1;
        int searchNum = 999;
        while (true) {
            int number = random.nextInt(1000);
            if (number == searchNum) {
                break;
            }
            count++;
        }
        System.out.println("Число " + searchNum + ", было найдено с " + count + "й попытки.");
    }

    public static void massReverse(int[] mass) {
        System.out.println(Arrays.toString(mass) + " Origin");
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(mass) + " Reverse");
    }

    public static void main(String[] args) {
        massMeat(new String[] {"\"Это\"", "\"шашлык\"", "\"на\"", "\"шампуре\""});

        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};
        massNumeric(arrayOfNumbers);

        generateNum();
        massReverse(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
