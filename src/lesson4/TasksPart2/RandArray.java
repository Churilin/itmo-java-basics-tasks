package lesson4.TasksPart2;

// Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.

import java.util.Arrays;
import java.util.Random;

public class RandArray {

    // С помощью метода generateRandomArray генерируется случайный массив чисел.
    // Для генерации случайных чисел заданы параметры:
    // размера массива 10, минимальное значение числа 1, максимальное значение 100.

    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

        System.out.println("Сортированный массив: " + Arrays.toString(array));
    }

    // Запускается сортировка слиянием с вызовом метода mergeSort.

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    // Метод merge создает временные массивы и помещает их в итоговый массив в отсортированном порядке.

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Метод generateRandomArray генерирует случайный массив заданного размера с числами в заданном диапазоне.

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}
