package lesson3;

// На основе класса создайте два объекта и пропишите для каждого характеристики.
// Добавление характеристик реализуйте через метод класса
// Выведите информацию про каждый объект.

public class MainHouse {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setHouseInfo(9, 1969, "1ЛГ-600А Ship-House");
        house1.displayHouseInfo();
        System.out.println("Количество лет с момента постройки: " + house1.getYearsSinceBuilt());

        House house2 = new House();
        house2.setHouseInfo(85, 2016, "Skyscraper OKO in Moskow-City");
        house2.displayHouseInfo();
        System.out.println("Количество лет с момента постройки: " + house2.getYearsSinceBuilt());
    }
}
