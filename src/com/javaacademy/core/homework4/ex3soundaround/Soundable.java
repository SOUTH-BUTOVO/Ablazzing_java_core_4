package com.javaacademy.core.homework4.ex3soundaround;

public interface Soundable {

    default String sound() {
        return "Я ";
    }
}
