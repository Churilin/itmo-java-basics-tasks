package lesson10;

// Написать метод, который записывает в файл строку, переданную параметром.

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        String text = "Вот вам яркий пример современных тенденций — внедрение современных методик " +
                "создаёт предпосылки для как самодостаточных, так и внешне зависимых концептуальных решений.";
        writeToFile("files/Output.txt", text);
    }

    public static void writeToFile(String filePath, String text) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Файл записан");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
