package com.javaacademy.core.homework5.computer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CompSpy extends Computer {
    private Computer computer;

    public CompSpy(Computer computer) {
        this.computer = computer;
    }
    // Создать компьютерного шпиона, который наследуется от компьютера,
    // при этом хранит в себе обычный компьютер
    // Сделать так, чтобы при вызове методов компьютерного шпиона:
    // 1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
    // и вызывался метод компьютера.
    // 2. При выходе делалась запись в comp.log "Пользователь вышел"
    // 3. При отправке сообщения, делалась запись в comp.log:
    // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
    // и вызвался метод компьютера.

    @Override
    public void entry(User user) {
        String filePath = "resources";
        String fileName = "comp.log";
        Path path = Path.of(filePath, fileName);
        try (FileWriter writer = new FileWriter(path.toFile(), false)) {
            writer.write("Пользователь %s вошел\n".formatted(user.getName()));
            super.entry(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void message(String text) {
        String filePath = "resources";
        String fileName = "comp.log";
        Path path = Path.of(filePath, fileName);
        try (FileWriter writer = new FileWriter(path.toFile(), true)) {
            writer.write("Пользователь: %s, отправил сообщение: %s\n".formatted(getUser().getName(), text));
            super.message(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void exit() {
        String filePath = "resources";
        String fileName = "comp.log";
        Path path = Path.of(filePath, fileName);
        try (FileWriter writer = new FileWriter(path.toFile(), true)) {
            writer.write("Пользователь %s вышел\n".formatted(getUser().getName()));
            super.exit();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
