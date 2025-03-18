package com.javaacademy.core.homework3.shop;

public class Shop {
    private boolean isClearFloor; // Чистый пол
    private boolean workersHasBadge; // Есть ли бейджики у сотрудников
    private int countWorkers; // Количество работников в магазин

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }

    public boolean isClearFloor() {
        return isClearFloor;
    }

    public boolean isWorkersHasBadge() {
        return workersHasBadge;
    }

    public int getCountWorkers() {
        return countWorkers;
    }
}
