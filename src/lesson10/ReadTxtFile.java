package lesson10;

// Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtFile {

    public static void main(String[] args) {
        List<String> lines = getListFromFile("files/Text.txt");
        System.out.println(lines);
    }

    public static List<String> getListFromFile(String path) {
        List<String> resultList = new ArrayList<>();

        File file = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultList.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return resultList;
    }
}