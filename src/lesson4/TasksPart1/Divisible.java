package lesson4.TasksPart1;

// Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое

public class Divisible {
    public static void main(String[] args) {
        printDivisible(1, 100, 3, 5);
    }

    public static void printDivisible(int min, int max, int divisor1, int divisor2) {
        String divisibleByDiv1 = "Делится на " + divisor1 + ": ";
        String divisibleByDiv2 = "Делится на " + divisor2 + ": ";
        String divisibleByBoth = "Делится на " + divisor1 + " и " + divisor2 + ": ";

        for (int i = min; i <= max; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                divisibleByBoth += i + " ";
            } else if (i % divisor1 == 0) {
                divisibleByDiv1 += i + " ";
            } else if (i % divisor2 == 0) {
                divisibleByDiv2 += i + " ";
            }
        }

        System.out.println(divisibleByDiv1);
        System.out.println(divisibleByDiv2);
        System.out.println(divisibleByBoth);
    }
}
