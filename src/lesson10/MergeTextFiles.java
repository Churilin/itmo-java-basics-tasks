package lesson10;

// Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла один.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MergeTextFiles {

    public static void main(String[] args) {

        mergeFiles("files/Text.txt", "files/Output.txt", "files/MergedOutput.txt");
    }

    public static void mergeFiles(String filePath1, String filePath2, String mergedFilePath) {

        List<String> textLines1 = getListFromFile(filePath1);
        List<String> textLines2 = getListFromFile(filePath2);

        try (FileWriter writer = new FileWriter(mergedFilePath)) {
            for (String line : textLines1) {
                writer.write(line + "\n");
            }
            for (String line : textLines2) {
                writer.write(line + "\n");
            }
            System.out.println("Файлы успешно склеены в " + mergedFilePath);
        } catch (IOException e) {
            System.err.println("Ошибка при склеивании файлов: " + e.getMessage());
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
