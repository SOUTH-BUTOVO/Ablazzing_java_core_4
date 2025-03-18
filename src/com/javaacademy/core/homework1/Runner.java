package com.javaacademy.core.homework1;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class Runner {

    public void fio() {
        String name = "   ПЕтРов   Олег ИванОвич       ";
        String nameFormat = name
                .trim()
                .replaceAll(" +", " ")
                .toUpperCase();

        int indexEndSecondName = nameFormat.indexOf(" ");
        String secondName = nameFormat.substring(0, indexEndSecondName);

        System.out.println(secondName.endsWith("ова".toUpperCase()) ? "Уважаемая: " + nameFormat :
                           secondName.endsWith("ов".toUpperCase()) ? "Уважаемый: "  + nameFormat :
                           "Неизвестное лицо: " + nameFormat);
    }

    public void checkCar() {
        // Количество топлива
        double fuel = 10;
        // Работоспособен или нет двигатель
        boolean isEngineWork = true;
        // Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        // Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10
        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
        && !hasErrors && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина НЕ работает");
        }
    }

    public void replaceString(String simply) {
        String simplyFormat = simply.replace("this is", "those are");
        int firstIndexLetter = simplyFormat.indexOf("o");
        int secondIndexLetter = simplyFormat.indexOf("o", firstIndexLetter + 1);
        System.out.println(simplyFormat);
        System.out.println("2-я буква \"o\" находится под индексом: " + secondIndexLetter);
    }

    public void factoryMeat() {
        /**
         * Компания Рога и Копыта производит мясные продукты
         * Перечень производимых товаров:
         * Колбаса - стоимость (цена) 800 рублей
         * себестоимость при производстве меньше 1000 кг - 412 руб
         * себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
         * себестоимость при производстве от 2000 - 404 руб
         *
         * Ветчина - стоимость 350 рублей
         * себестоимость при производстве - 275 руб
         *
         * Шейка - стоимость (цена) 500 руб
         * себестоимость при производстве меньше 500 кг - 311 руб
         * себестоимость при производстве больше или равно 500 кг - 299 руб
         *
         * Финансовые показатели
         * Доход компании считается как умножение стоимости на количество проданных кг
         * Расход компании считается как умножение себестоимости на количество проданных кг + миллион руб
         * Прибыль до налогов считается как: доход - расход
         * Налоги считаются так:
         * прибыль до налогов больше 2_000_000, облагается ставкой 13%
         * прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
         * прибыль до налогов больше до 1_000_000 (включительно), облагается ставкой 8%
         * пример расчёта налогов для прибыли до налогов 2_500_000:
         * 1_000_000 - налог 80_000 - по ставке 8%
         * 1_000_000 - налог 100_000 - по ставке 10%
         * 500_000 - 65_000 - по ставке 13%
         * Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
         * прибыль после налогов: прибыль до налогов - налог.
         *
         * Необходимо создать универсальную систему расчётов прибыли после налогов.
         * Т.е. на вход подаются данные по количеству произведённых продуктов и
         * печатается прибыль после налогов компании.
         * Узнать прибыль после налогов, при продаже:
         * Колбасы 2000 кг - произведено и продано.
         * Ветчины 8511 кг - произведено и продано.
         * Шейки 6988 кг - произведено и продано.
         */

        // Колбаса
        BigDecimal countSausage = valueOf(2000); // Произведено
        BigDecimal priceSausage = valueOf(800); // Цена
        BigDecimal costSausage = countSausage.intValue() >= 2_000 ? valueOf(404) :
                                    countSausage.intValue() >= 1_000 ? valueOf(408) :
                                    valueOf(412); // Себестоимость

        // Ветчина
        BigDecimal countHam = valueOf(8511);
        BigDecimal priceHam = valueOf(350);
        BigDecimal costHam = valueOf(275);

        // Шейка
        BigDecimal countNeck = valueOf(6988);
        BigDecimal priceNeck = valueOf(500);
        BigDecimal costNeck = countNeck.intValue() >= 500 ? valueOf(299) : valueOf(311);

        // Доход компании
        BigDecimal totalIncome = countSausage.multiply(priceSausage)
                                   .add(countHam.multiply(priceHam)
                                   .add(countNeck.multiply(priceNeck)));
        System.out.println("Доход компании: \t\t" + totalIncome);

        // Расход компании
        BigDecimal totalOutcome = costSausage.multiply(countSausage)
                                    .add(costHam.multiply(countHam))
                                    .add(costNeck.multiply(countNeck))
                                    .add(valueOf(1_000_000));
        System.out.println("Расход компании: \t\t" + totalOutcome);

        // Прибыль до налогов
        BigDecimal profitBeforeTax = totalIncome.subtract(totalOutcome);
        System.out.println("Прибыль до налогов: \t" + profitBeforeTax);

        // Налоги
        BigDecimal totalTax = valueOf(profitBeforeTax.intValue() > 2_000_000 ?
                1_000_000 * 0.08 + 1_000_000 * 0.1 + (profitBeforeTax.intValue() - 2_000_000) * 0.13 :
                profitBeforeTax.intValue() > 1_000_000 ? 1_000_000 * 0.08 +
                (profitBeforeTax.intValue() - 1_000_000) * 0.1 : profitBeforeTax.intValue() * 0.08);
        System.out.println("Налоги: \t\t\t\t" + totalTax);

        // Прибыль после налогов
        BigDecimal profitAfterTaxes = profitBeforeTax.subtract(totalTax);
        System.out.println("Прибыль после налогов: \t" + profitAfterTaxes);
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        Runner runner = new Runner();
        //calc.calc();
        runner.fio();
        runner.checkCar();
        runner.replaceString("this is simply. This is my favorite song.");
        runner.factoryMeat();
    }
}
