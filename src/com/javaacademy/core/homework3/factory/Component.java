package com.javaacademy.core.homework3.factory;

import java.util.Arrays;

public abstract class Component {
    private Camera camera;
    private Processor[] processor;
    private Corpus corpus;

    public Component(Camera camera, Processor[] processor, Corpus corpus) {
        this.camera = camera;
        this.processor = processor;
        this.corpus = corpus;
        for (Processor cpu : processor) {
            if (cpu == null) {
                throw new RuntimeException("Процессор не установлен!");
            }
        }
    }

    public void takeFoto() {
        System.out.printf("Сделано фото в %s мегапикселя\n", camera.getNumberMegaPixel());

    }

    public void infoProcessor() {
        int count = 1;
        for (Processor cpu : processor) {
            System.out.printf("Процессор %s : %s\n", count, cpu);
            count++;
        }
    }

    public Camera getCamera() {
        return camera;
    }

    public Processor[] getProcessor() {
        return processor;
    }

    public Corpus getCorpus() {
        return corpus;
    }

    @Override
    public String toString() {
        return "Component{" + "camera=" + camera + ", processor=" + Arrays.toString(processor) +
                ", corpus=" + corpus + '}';
    }
}
