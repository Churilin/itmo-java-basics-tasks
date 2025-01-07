package lesson4.TasksPart2;

// Дан массив чисел. Найдите первое уникальное в этом массиве число.

import java.util.Arrays;

public class firstUniqNumb {

    public static void main(String[] args) {
        int[] its = {4, 7, 4, 6, 1, 6};
        findFirstUniqNumb(its);
    }

    public static void findFirstUniqNumb(int[] array) {
        System.out.println("Для массива: " + Arrays.toString(array));
        int size = array.length;
        int firstUniqueNum = -1;

        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < size; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                firstUniqueNum = array[i];
                break;
            }
        }

        System.out.println("Первое уникальное число: " + firstUniqueNum);
    }
}
