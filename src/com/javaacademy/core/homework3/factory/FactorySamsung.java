package com.javaacademy.core.homework3.factory;

public class FactorySamsung {
    private static Samsung[] samsungs = new Samsung[10];
    private static int countCreatePhone = 0;

    public void createSamsung() {
        Samsung samsung = new Samsung(new Camera(16),
                                   new Processor[] {new Processor(1000)},
                                   new Corpus(200, 60, 15));
        samsungs[countCreatePhone++] = samsung;
    }

    public Samsung[] getSamsungs() {
        System.out.println("Самсунгов создано: " + countCreatePhone);
        return samsungs;
    }
}
