package com.javaacademy.core.lesson7.shoes_factory_ex1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Factory russiaFactory = new Factory(Country.RUSSIA);
        Factory belarusFactory = new Factory(Country.BELARUS);
        Factory franceFactory = new Factory(Country.FRANCE);
        Factory krokoziyaFactory = new Factory(null);

        System.out.println(russiaFactory);
        System.out.println(franceFactory);
        //System.out.println(krokoziyaFactory);

        System.out.println(Country.RUSSIA.getName());

        Country.FRANCE.setName("Франция");
        System.out.println(Country.FRANCE);

        System.out.println(Arrays.toString(Country.values()));

        Factory russia = new Factory(Country.valueOf("RUSSIA"));
        System.out.println(russia);
    }
}
