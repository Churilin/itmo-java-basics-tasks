package lesson6.Tasks1and2;

//Абстрактные классы. Создайте несколько классов: абстрактный класс Человек;

public abstract class Human {
    private final String firstName;
    private final String lastName;

    //конструктор для установки значений
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //метод для получение имени
    public String getFirstName() {
        return this.firstName;
    }

    //метод для получение фамилии
    public String getLastName() {
        return this.lastName;
    }

    //реализация функции для вывода информации
    public abstract void printInfo();
}
