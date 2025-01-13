package lesson4.TasksPart2;

// Напишите метод, который меняет местами первый и последний элемент массива.

import java.util.Arrays;

public class SwapFirstLast {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array1));

        swapFirstLast(array1);

        System.out.println("Array 2: " + Arrays.toString(array1));
    }

    public static void swapFirstLast(int[] array) {
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }
}
