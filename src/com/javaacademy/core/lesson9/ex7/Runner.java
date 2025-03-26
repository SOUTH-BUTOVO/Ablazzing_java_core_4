package com.javaacademy.core.lesson9.ex7;

public class Runner {
    public static void main(String[] args) {
        int res1 = 0;
        for (int i = 0; i <= 100; i++) {
            res1 += i;
        }
        System.out.println(res1);

        int res2 = 0;
        int count = 0;
        while (count <= 100) {
            res2 += count;
            count++;
        }
        System.out.println(res2);

        System.out.println(getSum(100)); // Max 18_999
    }

    private static int getSum(int num) {
        if (num == 0) {
            return 0;
        }
        int res = num + getSum(num - 1);
        return res;
    }
}
