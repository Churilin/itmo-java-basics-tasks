package lesson4.TasksPart1;

// Напишите программу, чтобы проверить,
// появляется ли число 3 как первый или последний элемент массива целых чисел.
// Длина массива должна быть больше или равна двум

import java.util.Scanner;

public class ArrayElement {

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
        return (array[0] == 3) || array[array.length - 1] == 3;
    }
}
