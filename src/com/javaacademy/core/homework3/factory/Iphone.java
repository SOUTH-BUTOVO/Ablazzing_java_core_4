package com.javaacademy.core.homework3.factory;

public class Iphone extends Component {
    public Iphone(Camera camera, Processor[] processor, Corpus corpus) {
        super(camera, processor, corpus);
        if (processor.length != 2) {
            throw new RuntimeException("В телефоне не установлено нужное количество процессоров.");
        }
    }
}
