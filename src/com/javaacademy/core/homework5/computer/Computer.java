package com.javaacademy.core.homework5.computer;

public class Computer {
    private User user;

    // Создать компьютер:
    // 1. Компьютер хранит в себе пользователя, который вошел в компьютер
    // 2. Компьютер умеет:
    // 2.1. Делать вход пользователя (на вход имя пользователя).
    // Изменяет пользователя, который зашел в компьютер
    // 2.2 Делать выход пользователя. Удаляет пользователя из системы
    // 2.3. Отправляет сообщение (на вход текст сообщения).
    // Печатает на экран "сообщение: {текст сообщения}".

    public void message(String text) {
        System.out.println("Сообщение: " + text);
    }

    public void entry(User user) {
        this.user = user;
    }

    public void exit() {
        user = null;
    }

    public User getUser() {
        return user;
    }
}
