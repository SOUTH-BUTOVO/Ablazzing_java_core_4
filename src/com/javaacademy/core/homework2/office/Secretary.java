package com.javaacademy.core.homework2.office;

public class Secretary {

    public void dontWorry(Boss boss, Manager manager, Security security) {
        System.out.printf("%s не волнуйтесь, %s всё успеет. %s подождите!",
                boss.getName(), manager.getName(), security.getName());
    }
}
