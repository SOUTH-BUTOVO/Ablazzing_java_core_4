package com.javaacademy.core.homework4.ex3soundaround;

public class Human implements Soundable {

    @Override
    public String sound() {
        return Soundable.super.sound() + "человек.";
    }
}
