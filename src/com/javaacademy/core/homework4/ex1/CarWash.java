package com.javaacademy.core.homework4.ex1;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class CarWash {
    private final BigDecimal rateLightCar = valueOf(2_000);
    private final BigDecimal rateBigCar = valueOf(4_000);
    private BigDecimal totalCost = BigDecimal.ZERO;

    public BigDecimal carClean(Car car) {
        BigDecimal costWash = car.getLength() > 6 ||
                              car.getWidth() > 2 ||
                              car.getHeight() > 2.5 ?
                              rateBigCar : rateLightCar;

        totalCost = totalCost.add(costWash);
        car.clean();
        return totalCost;
    }
}
