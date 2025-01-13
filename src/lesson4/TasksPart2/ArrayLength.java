package lesson4.TasksPart2;

// Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
// затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        getAndPrintArray();
    }

    public static void getAndPrintArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Numbers of array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(array));
    }
}
