package com.javaacademy.core.lesson10.ex2;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        try (InputStream resourceAsStream = Runner.class.getClassLoader().getResourceAsStream("config.txt");
             Scanner scanner = new Scanner(resourceAsStream)) {
            System.out.println(scanner.nextLine());

        }
    }

    private static void ex4() throws IOException {
        String contentPath = "src/com/javaacademy/core/lesson10/ex2";
        String resourcesPath = "resources";
        String fileName = "lesson10.txt";
        Path path = Path.of(resourcesPath, fileName);

        try (FileWriter fileWriter = new FileWriter(path.toFile())) {
            fileWriter.write("У меня 10й урок!");
        }
    }

    private static void ex3() throws IOException {
        Path path = Path.of("numbers.txt");
        Scanner scanner = new Scanner(path);

        int sum = 0;
        int line = 1;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (line % 2 != 0) {
                sum += Integer.parseInt(str);
            }
            line++;
        }

        for (int i = 1; scanner.hasNextLine(); i++) {
            String str = scanner.nextLine();
            if (i % 2 != 0) {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(sum);

        scanner.close();
    }

    private static void ex2() throws IOException {
        String filePath1 = "my_data.txt";
        String filePath2 = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_java_core_4\\my_data.txt";
        Path path = Path.of("my_data.txt");
        File file = new File("my_data.txt");

        Scanner scanner1 = new Scanner(path);
        Scanner scanner2 = new Scanner(file);

        String res = "";
        while (scanner1.hasNextLine()) {
            //System.out.println(scanner1.nextLine());
            //System.out.println(scanner2.nextLine());
            res += scanner1.nextLine() + "\n";
        }
        System.out.println(res);

        scanner1.close();
        scanner2.close();
    }

    private static void ex1() throws IOException {
        // Прочитать файл my_data.txt
        String filePath = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_java_core_4\\my_data.txt";
        FileReader fileReader = new FileReader(filePath);

        while (fileReader.ready()) {
            System.out.print((char) fileReader.read());
        }
        System.out.println();

        fileReader.close();
    }
}
