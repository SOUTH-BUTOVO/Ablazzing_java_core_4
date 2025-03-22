package com.javaacademy.core.lesson8.ex3;

/**
 * Лесорубка
 */
public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }

    public void makeProfit() {
//        try {
//            worker.chop();
//            System.out.println("Заделали много деняк!");
//        } catch (AxeIsBrokenException e) {
//            System.out.println("Не могу рубить деревья " + e.getMessage());
//        } catch (WorkerIsDrunkException e) {
//            System.out.println("Рабочий не допущен к работе по причине " + e.getMessage());
//        }

        try {
            worker.chop();
        } catch (AxeIsBrokenException | WorkerIsDrunkException e) {
            System.out.println("Проблемы у сотрудника " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
