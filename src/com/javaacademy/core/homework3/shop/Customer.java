package com.javaacademy.core.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private String name;
    private int countCheck = 0;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        if (shop.isClearFloor()) {
            countCheck++;
        }
        if (shop.isWorkersHasBadge()) {
            countCheck++;
        }
        if (shop.getCountWorkers() > 2) {
            countCheck++;
        }
        if (countCheck >= 2) {
            System.out.println(name + ": Магазин прошёл проверку");
        } else {
            System.out.println(name + ": Магазин не прошёл проверку");
        }
    }
}
