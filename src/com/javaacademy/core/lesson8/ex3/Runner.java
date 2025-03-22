package com.javaacademy.core.lesson8.ex3;

public class Runner {
    public static void main(String[] args) {
        // Есть лесорубка
        // На лесорубке есть лесоруб
        // У лесоруба есть топор
        // Топор обладает свойством - сломан или нет
        // Если топор сломан, лесоруб не может рубить
        // А лесорубка, зарабатывать деньги на рубке деревьев.
        // Если лесоруб пьян, то работать он не может./

        Axe axe = new Axe();
        Worker worker = new Worker(axe);
        Firm firm = new Firm(worker);

        firm.makeProfit();
        firm.makeProfit();

//        axe.broken();
        worker.drink();
        firm.makeProfit();
    }
}
