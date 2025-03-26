package com.javaacademy.core.homework5;

import com.javaacademy.core.homework5.computer.CompSpy;
import com.javaacademy.core.homework5.computer.Computer;
import com.javaacademy.core.homework5.computer.User;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
// Донаты со всего мира
// Одному блогеру присылают пожертвования(донаты) за его ролики
// Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
// Необходимо посчитать сумму пожертвований от пользователей из каждой страны
// Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
// String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
// String filename = "donation.csv";
// Чтение файла из папки resources (без привязки к конкретному расположению проекта)
// Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
// System.out.println(scanner.nextLine());

// Ожидаемый вывод:
// Список пожертвований по странам (пример):
// Россия - 14233.00
// Франция - 8000.32
// Китай - 20000.11
// Япония - 124.10
// Турция - 777.55

        // Плохая строка: Китай;159.58d
        // Плохая строка: Турция;42!5.15
        // Плохая строка: Франция;75T1.99
        // Плохая строка: Россия;229.66s
        // ==============================
        // Россия	- 84369,25
        // -------------------
        // Франция	- 104344,51
        // -------------------
        // Китай	- 86550,93
        // -------------------
        // Япония	- 115128,37
        // -------------------
        // Турция	- 108888,04
        // -------------------/


        // Сделать компьютерного шпиона
        // Смысл задания - отслеживать действия реального объекта и записывать их в лог
        // Создать компьютер:
        // 1. Компьютер хранит в себе пользователя, который вошел в компьютер
        // 2. Компьютер умеет:
        // 2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        // 2.2 Делать выход пользователя. Удаляет пользователя из системы
        // 2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        // Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        // Сделать так, чтобы при вызове методов компьютерного шпиона:
        // 1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        // 2. При выходе делалась запись в comp.log "Пользователь вышел"
        // 3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        // Создать Runner
        // 1. В нем создать компьютер.
        // 2. Создать шпиона с компьютером из пункта 1
        // 3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        // 4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)


        //ex1();
        //ex2();
    }

    private static void ex2() {
        User oleg = new User("Oleg");
        Computer computer = new Computer();
        CompSpy compSpy = new CompSpy(computer);
        compSpy.entry(oleg);
        compSpy.message("Это домашняя работа №5 ex2.");
        compSpy.exit();
    }

    private static void ex1() throws IOException {
        Scanner scanner = new Scanner(Path.of("resources/donation.csv"));
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        BigDecimal[] donations = new BigDecimal[countries.length];
        Arrays.fill(donations, BigDecimal.ZERO);
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().replaceAll(",", ".");
            int indexCountry = line.indexOf(';');
            String money = line.substring(indexCountry + 1);

            for (int j = 0; j < countries.length; j++) {
                if (line.contains(countries[j])) {
                    try {
                        donations[j] = donations[j].add(new BigDecimal(money));
                    } catch (NumberFormatException e) {
                        System.out.println("Плохая строка: " + line);
                    }
                }
            }
        }
        System.out.println("==============================");
        // Распечатываем страны и сумму доната из этой страны
        for (int i = 0; i < countries.length; i++) {
            System.out.printf("%s\t- %.2f%n", countries[i], donations[i]);
            System.out.println("-------------------");
        }
    }
}
