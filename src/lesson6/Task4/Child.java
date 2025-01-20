package lesson6.Task4;

class Child extends Parent {

    // В классе-наследнике: метод для вывода переменной из главного класса.

    public void displayNumber() {
        System.out.println(number);
    }

    public static void main(String[] args) {

        // Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.

        Child child = new Child();
        System.out.println("Результат:");
        child.displayNumber();
    }
}