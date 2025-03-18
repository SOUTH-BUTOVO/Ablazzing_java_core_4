package com.javaacademy.core.lesson4;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("Petr", 100);
        Soldier soldier2 = new Soldier("Ivan", 90);
        Soldier soldier3 = new Soldier("Oleg", 100, "General");
        Soldier soldier5 = new Soldier();
        Soldier soldier6 = new Soldier("Vasya", 188);

//        soldier1.name = "Petr";
//        soldier1.hp = 100;

        System.out.println("Имя солдата: " + soldier1.getName());
        System.out.println("Здоровье солдата: " + soldier1.getHp());

        System.out.println("Имя солдата: " + soldier2.getName());
        System.out.println("Здоровье солдата: " + soldier2.getHp());
        System.out.println("----------------------------");

        soldier1.go();
        soldier2.go();
        System.out.println("----------------------------");

        soldier1.fight(soldier2);
        System.out.println("\n----------------------------");

        soldier1.onFire();
        System.out.println("----------------------------");

        System.out.println(soldier3);
        System.out.println("----------------------------");

        Soldier soldier4 = new Soldier("Yuri", 100);
        System.out.println(soldier4);
        System.out.println("----------------------------");

        System.out.println(soldier5);
        System.out.println("----------------------------");

        System.out.println(soldier6);
        System.out.println("----------------------------");

        String artefact1 = "Щит";
        String artefact2 = "Меч";
        String artefact3 = "Лук";
        String artefact4 = "Копьё";
        String[] artefacts = {artefact1, artefact2, artefact3};
        soldier1.takeArtefacts(artefacts);
        soldier1.takeArtefacts(new String[] {"Щит", "Меч", artefact3, "Копьё"});
        System.out.println(Arrays.toString(soldier1.artefacts));
        System.out.println(soldier1);
        System.out.println("----------------------------");
    }
}
