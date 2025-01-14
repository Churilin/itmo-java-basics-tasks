package lesson3;

//Создайте простой класс, который будет иметь поля: цвет, название, вес.

public class Car {
    private String color;
    private String name;
    private double weight;

//    Добавьте несколько конструкторов, которые будут устанавливать:
//    только цвет машины

    public Car(String color) {
        this.color = color;
    }

//    цвет и вес машины

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

//    пустой конструктор

    public Car() {
    }

    //Создайте метод в классе через который можно будет вывести все эти данные.

    public void displayCarInfo() {
        System.out.println("Информация о автомобиле: ");
        System.out.println("Цвет: " + color);
        System.out.println("Название: " + name);
        System.out.println("Вес: " + weight + " кг");
    }

    //Добавьте два объекта, установите для них значения и выведите все при помощи ранее созданного метода.

    public static void  main(String[] args) {
        Car car1 = new Car("Мокрый асфальт");
        car1.name = "GEELY Preface";
        car1.weight = 1638;

        Car car2 = new Car("Снежная королева", 1330);
        car2.name = "LADA Aura";

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
