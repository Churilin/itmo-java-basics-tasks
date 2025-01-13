package lesson6.Tasks1and2;

//1.Абстрактные классы
//Создайте несколько классов: класс Работник банка
//В класс Работник банка добавьте: наследование класса Человек

public class BankWorker extends Human implements Information {
    //строковое поле «название банка»
    private final String bankName;

    //конструктор для установки всех значений
    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    //реализация функции для вывода информации
    @Override
    public void printInfo() {
        System.out.println("Сотрудник " + this.getFirstName() + " " + this.getLastName() + " работает в банке " + this.bankName);
    }

    public String getBankName() {
        return bankName;
    }
}
