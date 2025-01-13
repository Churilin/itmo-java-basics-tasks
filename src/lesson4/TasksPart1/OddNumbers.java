package lesson4.TasksPart1;

// программа, которая выводит на консоль нечетные числа от 1 до 99

public class OddNumbers {
    public static void main(String[] args) {
        printOdd(1, 99);
}

    public static void printOdd(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
