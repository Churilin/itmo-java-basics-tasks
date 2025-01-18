package lesson6.Task5;

// Создайте главный класс. Добавьте в него: метод для получения возраста пользователя.

import java.util.Scanner;

public abstract class Parent {

    protected Scanner scanner;

    public Parent() {
        scanner = new Scanner(System.in);
    }

    public int getAge() {
        System.out.println("Введите возраст: ");
        return scanner.nextInt();
    }

    public abstract String getInfo();

}