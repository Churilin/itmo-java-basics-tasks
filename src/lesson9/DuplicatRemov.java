package lesson9;

// Написать метод, который на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatRemov {
    public static Set<Object> removeDuplicates(List<Object> objectList) {
        return new HashSet<>(objectList);
    }

    public static void main(String[] args) {
        Object objectA = new Object();
        Object objectB = new Object();
        Object objectAB = objectA;
        Object objectC = new Object();
        Object objectD = new Object();
        Object objectCA = objectC;

        List<Object> objectList = new ArrayList<>();
        objectList.add(objectA);
        objectList.add(objectAB);
        objectList.add(objectB);
        objectList.add(objectC);
        objectList.add(objectCA);
        objectList.add(objectD);

        System.out.println("Уникальных объектов в коллекции: " + removeDuplicates(objectList).size());
    }
}
