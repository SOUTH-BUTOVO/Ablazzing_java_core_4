package com.javaacademy.core.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        int countCheck = 0;
//        if (shop.isClearFloor()) {
//            countCheck++;
//        }
//        if (shop.isWorkersHasBadge()) {
//            countCheck++;
//        }
//        if (shop.getCountWorkers() > 2) {
//            countCheck++;
//        }

//        if (countCheck >= 2) {
//            System.out.println(name + ": Магазин прошёл проверку");
//        } else {
//            System.out.println(name + ": Магазин не прошёл проверку");
//        }

        countCheck += shop.isClearFloor() ? 1 : 0;
        countCheck += shop.isWorkersHasBadge() ? 1 : 0;
        countCheck += shop.getCountWorkers() > 2 ? 1 : 0;

        System.out.println(countCheck >= 2 ? name + ": Магазин прошёл проверку" :
                                             name + ": Магазин не прошёл проверку");
    }
}
