package lesson6.Task4;

import java.util.Scanner;

// Создайте два класса: главный и класс-наследник

public class Parent {

    // В главном классе: создайте поле для ввода целого числа

    protected int number;

    public Parent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        this.number = scanner.nextInt();
    }
}