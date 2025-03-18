package com.javaacademy.core.lesson5.lottery;

public class Runner {
    public static void main(String[] args) {
        int count = 0;
        Ticket[] tickets = new Ticket[2000];

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket();
            count++;
        }
        Ticket lastTicket = tickets[999];
        System.out.printf("%s Ура выигрыш! %s\n", count, lastTicket.getWinSum());
        System.out.println(tickets[1999].getWinSum());

    }
}
