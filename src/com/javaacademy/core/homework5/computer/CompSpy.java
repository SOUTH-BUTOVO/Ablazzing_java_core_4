package com.javaacademy.core.homework5.computer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CompSpy extends Computer {
    private Computer computer;

    private String filePath = "resources";
    private String fileName = "comp.log";
    private Path path = Path.of(filePath, fileName);

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
        writeToLog("Пользователь %s вошел".formatted(user.getName()));
        super.entry(user);
    }

    @Override
    public void message(String text) {
        writeToLog("Пользователь: %s, отправил сообщение: %s".formatted(getUser().getName(), text));
        computer.message(text);
    }

    @Override
    public void exit() {
        writeToLog("Пользователь %s вышел".formatted(getUser().getName()));
        computer.exit();
    }

    private void writeToLog(String text) {
        try (FileWriter writer = new FileWriter(path.toFile(), true)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
