package com.javaacademy.core.lesson8.ex3;

/**
 * Топор
 */
public class Axe {
    private boolean isBroken = false;

    public void broken() {
        isBroken = true;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
