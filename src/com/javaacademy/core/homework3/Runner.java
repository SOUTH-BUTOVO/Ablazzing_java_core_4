package com.javaacademy.core.homework3;

import com.javaacademy.core.homework3.city.City;
import com.javaacademy.core.homework3.city.House;
import com.javaacademy.core.homework3.factory.FactoryIphone;
import com.javaacademy.core.homework3.factory.FactorySamsung;
import com.javaacademy.core.homework3.factory.Iphone;
import com.javaacademy.core.homework3.factory.Samsung;
import com.javaacademy.core.homework3.pyramid.Pyramid1;
import com.javaacademy.core.homework3.pyramid.Pyramid2;
import com.javaacademy.core.homework3.pyramid.Pyramid3;

import java.util.Arrays;

public class Runner {

    public static void ex1() {
        // Зайти в Shop.
    }

    public static void ex2() {
        // Задача Фабрика телефонов
        // Организовать фабрику создания двух телефонов
        //
        // Создать комплектующие телефона
        // - Камера: умеет фотографировать. Свойство - количество мега пикселей.
        // - Процессор: свойство - количество вычислений в секунду (mhz).
        // - Корпус: свойства - размеры - ширина, высота, длинна.
        //
        // Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
        // Умеет фотографировать используя камеру (печать в консоль - "Сделано фото").
        //
        // Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
        // Умеет фотографировать используя камеру (печать в консоль - "Сделано фото").
        // Умеет печатать на экран информацию о процессорах.
        //
        // Создать фабрику Iphone, которая:
        // - Создаёт iphone и заполняет его двумя процессорами (1000 Mhz), 8 Мегапиксельной камерой
        // и корпусом 60х200х10
        //
        // Создать фабрику Samsung которая:
        // - Создаёт samsung и заполняет его процессором (1500 Mhz), 16 Мегапиксельной камерой
        // и корпусом 60х200х15
        // ВНИМАНИЕ! Фабрики создают телефоны без создания экземпляра фабрики!/
        FactoryIphone factoryIphone = new FactoryIphone();
        factoryIphone.createIphone();
        factoryIphone.createIphone();
        factoryIphone.createIphone();
        Iphone[] iphones = factoryIphone.getIphones();
        for (Iphone iphone : iphones) {
            if (iphone != null) {
                iphone.takeFoto();
                iphone.infoProcessor();
                System.out.println("-------------");
            }
        }
        System.out.println("===========================");

//        FactorySamsung factorySamsung = new FactorySamsung();
//        factorySamsung.createSamsung();
//        factorySamsung.createSamsung();
//        Samsung[] samsungs = factorySamsung.getSamsungs();
//        for (Samsung samsung : samsungs) {
//            if (samsung != null) {
//                samsung.takeFoto();
//                System.out.println(samsung.getCorpus());
//                System.out.println("-------------");
//            }
//        }

        Samsung samsung1 = FactorySamsung.createSamsung();
        samsung1.takeFoto();
        samsung1.getProcessor();
        Samsung samsung2 = FactorySamsung.createSamsung();
        System.out.println(samsung2.equals(samsung1));
        FactorySamsung.getSamsungs();
    }

    public static void ex3() {
        // Задача: Пирамида наследования.
        // Создать классы Pyramid1, Pyramid2, Pyramid3.
        // НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // - M <- из Pyramid1
        // - MM <- из Pyramid2
        // - MMM <- из Pyramid3
        //
        // Т.е. при вызове pyramid1.print выведется:
        // - М
        // - ММ
        // - МММ
        //
        // при вызове pyramid2.print выведется:
        // - ММ
        // - МММ
        //
        // при вызове pyramid3.print выведется:
        // - МММ
        //
        // Создать здесь экземпляр класса pyramid1 и вызвать print./
        Pyramid1 pyramid1 = new Pyramid1();
        Pyramid2 pyramid2 = new Pyramid2();
        Pyramid3 pyramid3 = new Pyramid3();
        pyramid1.prt();
        System.out.println("---");
        pyramid2.prt();
        System.out.println("---");
        pyramid3.prt();
    }

    public static void ex4() {
        // Задача: Иммутабельный город.
        //
        // Создать класс House (наименование улицы, номер дома) - создать сеттеры и геттеры.
        // Переопределить вывод в текст - вывод улицы и номер дома.
        // Создать иммутабельный класс City (наименование города и массив домов).
        // Переопределить вывод в текст - что бы выводило имя города и все дома.
        //
        // 1. Создать два дома, создать город с массивом созданных домов.
        // 2. Сделать так, что бы у города нельзя было поменять свойства./
        // 3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
        // эти изменения не затронут дом находящийся внутри города.
        // Т.е. результат должен соответствовать псевдокоду ниже:
        //
        //[] - квадратные скобки - массив
        //{} - объект
        // City city = new City([{new House('Lenina', 1)}], "Мурманск");
        // System.out.println(city);
        //-- City{[House{street: Lenina, house: 1}], name: "Мурманск"}
        //House house = city.getHouses()[0];
        //house.setStreet('Kotova');
        //System.out.println(house);
        //-- House{street: Kotova, house: 1}
        //System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}
        House house1 = new House("Фруктовая", 15);
        House house2 = new House("Строителей", 8);
        City city = new City(new House[]{house1, house2}, "Циолковского");

        for (House house : city.getHouses()) {
            house.setHouseNumber(404);
            System.out.println(house);
        }
        System.out.println("---------------");

        System.out.println(city);
    }

    public static void main(String[] args) {
//        ex2();
//        ex3();
        ex4();
    }
}
