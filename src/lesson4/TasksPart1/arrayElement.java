package lesson4.TasksPart1;

// Напишите программу, чтобы проверить,
// появляется ли число 3 как первый или последний элемент массива целых чисел.
// Длина массива должна быть больше или равна двум

import java.util.Arrays;
import java.util.Scanner;

public class arrayElement {

    public static void main(String[] args) {
        checkArrayElement();
    }

    public static void checkArrayElement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int[] array = new int[size];

        if (size >= 2) {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
        } else {
            System.out.println("Длина массива должна быть больше или равна 2.");
        }

        System.out.println("Массив: " + Arrays.toString(array));

        if ((array[0] == 3) || array[size - 1] == 3) {
            System.out.println("Результат: " + true);
        } else {
            System.out.println("Результат: " + false);
        }
    }
}
