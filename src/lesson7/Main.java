package lesson7;

// В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла, а также выведите информацию на экран.
// Создайте два объекта и добавьте разный вес для крыльев.

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane(132.8, 135.1);

        System.out.println();
        System.out.print("Крыло 1. ");
        plane.getWing1().printWingInfo();
        System.out.print("Крыло 2. ");
        plane.getWing2().printWingInfo();

        Plane plane2 = new Plane(67.5, 66.4);

        System.out.println();
        System.out.print("Крыло 1. ");
        plane2.getWing1().printWingInfo();
        System.out.print("Крыло 2. ");
        plane2.getWing2().printWingInfo();
    }
}
