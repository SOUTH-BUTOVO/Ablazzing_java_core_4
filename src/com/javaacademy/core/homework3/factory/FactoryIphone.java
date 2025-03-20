package com.javaacademy.core.homework3.factory;

public class FactoryIphone {
    private static Iphone[] iphones = new Iphone[10];
    private static int countCreatePhone = 0;

    public void createIphone() {
        Iphone iphone = new Iphone(new Camera(8),
                                   new Processor[] {new Processor(1000), new Processor(1000)},
                                   new Corpus(200, 60, 10));
        iphones[countCreatePhone++] = iphone;
    }

    public Iphone[] getIphones() {
        System.out.println("Айфонов создано: " + countCreatePhone);
        return iphones;
    }
}
