package lesson6.Tasks1and2;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Семен", "Фролов", "АкБарс Банк");
        Client client1 = new Client("Александр", "Иванов", "ВТБ");
        BankWorker bankWorker = new BankWorker("Андрей", "Фирсов", "Открытие");
        BankWorker bankWorker1 = new BankWorker("Валентин", "Сотников", "Финам");

        client.printInfo();
        client1.printInfo();
        bankWorker.printInfo();
        bankWorker1.printInfo();
    }
}
