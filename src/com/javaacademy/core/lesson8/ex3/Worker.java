package com.javaacademy.core.lesson8.ex3;

/**
 * Лесоруб
 */
public class Worker {
    private Axe axe;
    private boolean isDrunk = false;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    public void chop() throws AxeIsBrokenException, WorkerIsDrunkException {
        if (axe.isBroken()) {
            throw new AxeIsBrokenException("Топор сломан!");
        }
        if (isDrunk) {
            throw new WorkerIsDrunkException("Лесоруб пьяный!");
        }
        System.out.println("Дерево срублено");
    }

    public void drink() {
        isDrunk = true;
    }
}
