package lesson4.TasksPart1;

// Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу

import java.util.Scanner;

public class SumTwoInt {
    public static void main(String[] args) {
        checkSumEqInt();
    }

    static void checkSumEqInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();

        System.out.println("Результат: " + check(num1, num2, num3));
    }

    public static Boolean check(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum == thirdNum;
    }
}
