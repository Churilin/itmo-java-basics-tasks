package lesson6.Tasks1and2;

public class main {
    public static void main(String[] args) {

        client client = new client("Семен", "Фролов", "АкБарс Банк");
        client client1 = new client("Александр", "Иванов", "ВТБ");
        bankWorker bankWorker = new bankWorker("Андрей", "Фирсов", "Открытие");
        bankWorker bankWorker1 = new bankWorker("Валентин", "Сотников", "Финам");

        client.printInfo();
        client1.printInfo();
        bankWorker.printInfo();
        bankWorker1.printInfo();
    }
}
