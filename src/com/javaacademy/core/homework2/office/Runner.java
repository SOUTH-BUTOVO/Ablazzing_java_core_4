package com.javaacademy.core.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Пётр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        Security security = new Security("Петрович");
        Office office = new Office(boss, manager, secretary, security);
        office.workDay();
    }
}
