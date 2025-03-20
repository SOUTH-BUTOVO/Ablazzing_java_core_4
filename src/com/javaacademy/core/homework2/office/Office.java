package com.javaacademy.core.homework2.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workDay() {
        boss.getToWork(manager);
        manager.voice();
        security.giveMyMany();
        secretary.dontWorry(boss, manager, security);
    }
}
