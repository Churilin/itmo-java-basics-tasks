package lesson6.Task5;

// Создайте класс-наследник. Добавьте в него: переопределенный метод для получения имени пользователя.

public class Child extends Parent {

    public Child() {
        super();
    }

    @Override
    public String getInfo() {
        System.out.print("Введите имя: ");
        return scanner.next();
    }

    // Создайте объект на основе класса-наследника и используйте для него метод из класса

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Возраст: " + child.getAge() + "\n" + "Имя: " + child.getInfo() );
    }
}