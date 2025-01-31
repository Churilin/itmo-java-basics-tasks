package lesson6.Task3;

public class Truck extends Car{

    //В классе Грузовик создайте поля: количество колес; максимальный вес.

    private int wheelsNumber;
    private int maxWeight;

    //Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.

    public void newWheels(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
        System.out.println("У грузовика " + this.model + " изменилось количество колес. Теперь их " + this.wheelsNumber);
    }

    //В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.

    public Truck(int w, String m, char c, float s, int wheelsNumber, int maxWeight) {
        super(w, m, c, s);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public static void main (String[] args) {
        Truck truck = new Truck(8000, "Камаз-6585 Атлант", 'G', 75.0f, 12, 60000);
        truck.newWheels(16);

    }
}
