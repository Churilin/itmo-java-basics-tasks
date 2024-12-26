package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Task 1");

        System.out.println("Я \nХорошо \nЗнаю \nJava.");

        // Задание 2
        System.out.println("Task 2");

        double res = (46 + 10) * (10 / 3d);
        System.out.println(res);
        int res1 = (29) * (4) * (-15);
        System.out.println(res1);

        // Задание 3
        System.out.println("Task 3");

        double number = 10500;
        double result = (number / 10) / 10;

        System.out.println("Результат с переменной number: " + result);

        // Задание 4
        System.out.println("Task 4");

        double a = 3.6;
        double b = 4.1;
        double c = 5.9;

        double result1 = a * b * c;

        System.out.println("Произведение трех чисел: " + result);

        // Задание 5
        System.out.println("Task 5. Введите ниже три целых числа:");

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextInt();
        int input = scanner.nextInt();
        scanner.hasNextInt();
        int input1 = scanner.nextInt();
        scanner.hasNextInt();
        int input2 = scanner.nextInt();
        System.out.println(input + "\n" + input1 + "\n" + input2);

        // Задание 6
        System.out.println("Task 6. Введите ниже целое число:");

        Scanner scanner1 = new Scanner(System.in);

        int b1 = scanner1.nextInt();

        if (b1 % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b1 % 2 == 0 && b1 > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }

        scanner1.close();

    }
}