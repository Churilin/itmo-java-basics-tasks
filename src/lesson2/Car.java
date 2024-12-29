package lesson2;

public class Car {
    private CarBody carType; // тип кузова автомобиля
    private String model; // модель автомобиля
    private Integer doorsNumber; // количество дверей
    private boolean isUsed; // используется или находится в продаже
    private Long price; // цена автомобиля

    public Car() {
    }

    public Car(CarBody carType, String model, Integer doorsNumber, boolean isUsed, Long price) {
        this.carType = carType;
        this.model = model;
        this.doorsNumber = doorsNumber;
        this.isUsed = isUsed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", model='" + model + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", isUsed=" + isUsed +
                ", price=" + price +
                '}';
    }

    public CarBody getCarType() {
        return carType;
    }

    public void setCarType(CarBody carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(Integer doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void setPrice(Long price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.err.println("invalid price");
        }
    }

    public Long getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Car car = new Car(CarBody.CONVERTIBLE, "Koenigsegg", 2, true, 195000L);
        Car car1 = new Car(CarBody.SUV, "LI9", 5, false, 37000L);

        System.out.println(car);
        System.out.println(car1);
    }
}