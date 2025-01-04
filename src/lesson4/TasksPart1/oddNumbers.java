package lesson4.TasksPart1;

public class oddNumbers {
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
