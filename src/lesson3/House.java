package lesson3;

// Создайте класс Дом. Добавьте в него следующие данные: поля: количество этажей, год постройки, наименование;
// метод для установки всех значений; метод для вывода всех значений; метод, возвращающий количество лет с момента постройки.

import java.time.LocalDate;

class House {
    private int floors;
    private int yearBuild;
    private String name;

    public void setHouseInfo(int floors, int yearBuild, String name) {
        this.floors = floors;
        this.yearBuild = yearBuild;
        this.name = name;
    }

    public void displayHouseInfo() {
        System.out.println("Характеристики здания:");
        System.out.println("Этажность: " + floors);
        System.out.println("Год постройки: " + yearBuild);
        System.out.println("Наименование: " + name);
    }

    public int getYearsSinceBuilt() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearBuild;

    }
}
