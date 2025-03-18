package com.javaacademy.core.lesson5.lottery;

public class Ticket {
    private static int count = 0;
    private int winSum;

    public Ticket() {
        count++;
        if (count % 1_000 == 0) {
            winSum = 1_000_000;
            System.out.println("Ура выигрыш!");
        }
    }

    public int getWinSum() {
        return winSum;
    }
}
