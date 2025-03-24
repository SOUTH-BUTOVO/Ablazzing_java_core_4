package com.javaacademy.core.homework3.factory;

public class FactorySamsung {
    private static final int COUNT_MEGAPIXELS = 16;
    private static final int CPU_MHZ = 1000;
    private static final int CORPUS_LENGTH = 200;
    private static final int CORPUS_WIDTH = 60;
    private static final int CORPUS_THICKNESS = 15;
    private static Samsung samsungs;
    private static int countCreatePhone = 0;

    public static Samsung createSamsung() {
        Samsung samsung = new Samsung(new Camera(COUNT_MEGAPIXELS),
                                   new Processor[] {new Processor(CPU_MHZ)},
                                   new Corpus(CORPUS_LENGTH, CORPUS_WIDTH, CORPUS_THICKNESS));
        countCreatePhone++;
        return samsung;
    }

    public static void getSamsungs() {
        System.out.println("Samsung телефонов создано: " + countCreatePhone);
    }
}
