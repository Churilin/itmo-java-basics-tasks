package lesson4.TasksPart1;

// Напишите программу, чтобы проверить, что массив содержит число 1 или 3

import java.util.Arrays;
import java.util.Scanner;

public class containsOneOrThree {


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

        boolean containsOneOrThree = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == 1 || array[i] == 3) {
                containsOneOrThree = true;
                break;
            }
        }

        System.out.println("Результат: " + containsOneOrThree);
    }
}
