package lesson7;

// Создайте класс Самолет.
// В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
// поле для хранения информации про вес крыла;
// метод, что будет показывать вес крыла

public class Plane {
    private final Wing wing1;
    private final Wing wing2;

    public Plane(double wing1Weight, double wing2Weight) {
        System.out.println("Создаем новый самолет.");
        wing1 = new Wing(wing1Weight);
        wing1.printWingInfo();
        wing2 = new Wing(wing2Weight);
        wing2.printWingInfo();
        System.out.println("Самолет создан.");
    }

    public Wing getWing1() {
        return wing1;
    }

    public Wing getWing2() {
        return wing2;
    }

    public static class Wing {
        private final double weight;

        public Wing(double weight) {
            System.out.println("Создано крыло самолета.");
            this.weight = weight;
        }

        public void printWingInfo() {
            System.out.println("Вес данного крыла: " + this.weight + " тонн.");
        }
    }
}
