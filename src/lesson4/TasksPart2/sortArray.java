package lesson4.TasksPart2;

public class sortArray {

    public static void main(String[] args) {
        int[] its = {2, 10, 12, 64, 367, 439};
        sortArray(its);

        int[] its1 = {56, 4, 71, 5, 8665, 42};
        sortArray(its1);

    }

    public static void sortArray(int[] array) {
        boolean sorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
