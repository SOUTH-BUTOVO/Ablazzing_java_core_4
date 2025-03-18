package com.javaacademy.core.lesson4;

import java.util.Arrays;

/**
 * Класс Солдатик
 */
public class Soldier {
    String name;
    String title = "Рядовой";
    int hp;
    String[] artefacts;

    public Soldier() {
        this.name = "Безымянный солдат";
        this.hp = 100;
    }

    public Soldier(String name, int hp) {
        this.name = name;
        setHp(hp);
    }

    public Soldier(String name, int hp, String title) {
        this.name = name;
        setHp(hp);
        this.title = title;
    }

    public void go() {
        System.out.printf("Солдат %s идёт в перёд!\n", getName());
    }

    public void fight(Soldier anotherSoldier) {
        if (this.hp > anotherSoldier.hp) {
            anotherSoldier.setHp(0);
            System.out.printf("Победил %s", this.getName());
        } else {
            this.setHp(0);
            System.out.printf("Победил %s", anotherSoldier.getName());
        }
    }

    public void onFire() {
        while (true) {
            if (hp == 0) {
                return;
            }
            this.setHp(hp - 1);
            System.out.println("Горю!");
            System.out.printf("Здоровье %s %s\n", name, hp);
        }
    }

    public void takeArtefacts(String[] artefacts) {
        this.artefacts = artefacts;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getTitle() {
        return title;
    }

    public String[] getArtefacts() {
        return artefacts;
    }

    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100) {
            this.hp = hp;
        } else {
            System.out.println("Ошибка, нельзя присвоить здоровье здоровье меньше 0 или больше 100");
            //throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Soldier{" + "name='" + name + '\'' + ", title='" + title + '\'' +
                ", hp=" + hp + ", artefacts=" + Arrays.toString(artefacts) + '}';
    }
}
