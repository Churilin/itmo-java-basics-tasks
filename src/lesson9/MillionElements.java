package lesson9;

// Напишите метод, который добавляет 1млн элементов в ArrayList и LinkedList.
// Напишите метод, который выбирает из заполненного списка элемент наугад 100000 раз.
// Замерьте время которое потрачено на это.
// Сравните результаты, предположите, почему они именно такие.

import  java.util.ArrayList;
import  java.util.LinkedList;
import  java.util.List;

public class MillionElements {

    public static void main(String[] args) {

        long startTime;
        long endTime;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Вызываем метод для заполнения ArrayList 1000000 элементов от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        arrayList = getBigRandList(1000000, "ArrayList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("На заполнение ArrayList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Вызываем метод для заполнения LinkedList 1000000 элементов от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        linkedList = getBigRandList(1000000, "LinkedList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("На заполнение LinkedList ушло " + (endTime - startTime) + " мс.");

        System.out.println();

        System.out.println("Вызываем метод для получения случайного элемента из ArrayList 100000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(arrayList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("На получение элементов из ArrayList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Вызываем метод для получения случайного элемента из LinkedList 100000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(linkedList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("На получение элементов из LinkedList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Работа с LinkedList занимает намного больше времени, чем с ArrayList, " +
                "\n" + "т.к. в основе ArrayList лежит массив, доступ к элементам которого легко получить по номеру элемента, " +
                "\n" + "а для получения элементов LinkedList необходимо проходить всю цепочку разбросанных по памяти элементов до указанного номера.");

        System.out.println();

    }

    public static List<Integer> getBigRandList(int size, String listType, int maxVal) {
        List<Integer> result;

        switch (listType) {
            case "LinkedList": {
                result = new LinkedList<>();
                break;
            }
            case "ArrayList": {
                result = new ArrayList<>();
                break;
            }
            default: {
                System.out.println("Введен некорректный тип списка.");
                return null;
            }
        }

        for (int i = 0; i < size; i++) {
            int randVal = (int) ((Math.random() * (maxVal * 2 + 1)) - maxVal);
            result.add(randVal);
        }

        return result;

    }

    public static Integer getRandItemSomeTimes(List<Integer> list, int numTimes) {
        Integer lastItem = null;

        for (int i = 0; i < numTimes; i++) {
            int randomNum = (int) (Math.random() * list.size());
            lastItem = list.get(randomNum);
        }

        return lastItem;
    }
}
