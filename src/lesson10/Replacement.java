package lesson10;

// Написать метод, который заменяет в файле все кроме букв и цифр на знак ‘$’.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Replacement {

    public static void main(String[] args) {

        String text = "23.01.2025. Если вас интересует мое мнение – я выскажусь: настоящая дружба (именно дружба, " +
                "а не шапочное знакомство или приятельские отношения) проверяется в радости; умение разделить " +
                "радость другого человека – этим сегодня могут похвастаться немногие…очень немногие «друзья»!";
        Replacement("files/OutputReplacement.txt", text);
        replaceChars("files/OutputReplacement.txt");
    }

    public static void Replacement(String filePath, String text) {

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Файл записан");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void replaceChars(String filePath) {
        List<String> lines = getListFromFile(filePath);

        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : lines) {
                String replacedLine = line.replaceAll("[^А-Яа-яA-Za-z0-9]", "\\$");
                writer.write(replacedLine + "\n");
            }
            System.out.println("Все символы, кроме букв и цифр, заменены на '$' в файле " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при замене символов в файле " + filePath + ": " + e.getMessage());
        }
    }

    public static List<String> getListFromFile(String path) {
        List<String> resultList = new ArrayList<>();
        File file = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultList.add(line);
            }
            System.out.println("Данные успешно считаны из файла " + path);
        } catch (IOException e) {
            System.err.println("Ошибка при считывании данных из файла " + path + ": " + e.getMessage());
        }

        return resultList;
    }
}
