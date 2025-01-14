package lesson2;

import java.util.Scanner;

public class Calculator {
    // Сумма
    public static int sum(int a, int b) {return a + b;}
    public static double sum(double a, double b) {return a + b;}
    public static long sum(long a, long b) {return a + b;}
    //Деление
    public static double division(int a, int b) {return (double) a / (double) b;}
    public static double division(double a, double b) {return a / b;}
    public static double division(long a, long b) {return (double) a / (double) b;}
    //Умножение
    public static int multiplication(int a, int b) {return a * b;}
    public static double multiplication(double a, double b) {return a * b;}
    public static long multiplication(long a, long b) {return a * b;}
    //Вычитание
    public static int subtraction(int a, int b) {return a - b;}
    public static double subtraction(double a, double b) {return a - b;}
    public static long subtraction(long a, long b) {return a - b;}

    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа для их сложения:");
        double sum1 = scanner.nextDouble();
        double sum2 = scanner.nextDouble();
        System.out.println("Сумма чисел: " + Calculator.sum(sum1, sum2));

        System.out.println("Введите два числа для их деления:");
        double div1 = scanner.nextDouble();
        double div2 = scanner.nextDouble();
        System.out.println("Результат деления: " + Calculator.division(div1, div2));

        System.out.println("Введите два числа для их умножения:");
        double mult1 = scanner.nextDouble();
        double mult2 = scanner.nextDouble();
        System.out.println("Результат умножения: " + Calculator.multiplication(mult1, mult2));

        System.out.println("Введите два числа для вычисления результата разности чисел:");
        double sub1 = scanner.nextDouble();
        double sub2 = scanner.nextDouble();
        System.out.println("Результат вычетания: " + Calculator.subtraction(sub1, sub2));
    }
}
