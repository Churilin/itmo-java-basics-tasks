package lesson2;

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
}
