package lesson4.TasksPart1;

// Напишите программу, чтобы проверить, что массив содержит число 1 или 3

import java.util.Scanner;

public class ContainsOneOrThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int[] array = new int[size];

        if (size >= 2) {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            boolean result = checkArrayElement(array);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Длина массива должна быть больше или равна 2.");
        }
    }

    public static boolean checkArrayElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
