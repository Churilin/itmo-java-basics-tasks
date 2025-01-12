package lesson4.TasksPart1;

// Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
// если второе число больше первого числа, а третье число больше второго числа

import java.util.Scanner;

public class nextNumbIsBig {

    public static void main(String[] args) {
        checkMoreLess();
    }

    static void checkMoreLess() {
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
        return secondNum > firstNum && thirdNum > secondNum;
    }
}
