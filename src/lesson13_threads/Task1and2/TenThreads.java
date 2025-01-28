package lesson13_threads.Task1and2;

// Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.
// Выведете состояние потока перед его запуском, после запуска и во время выполнения.


public class TenThreads extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " is " + getState() + " - started");

        for (int i = 0; i <= 100; i++) {
            System.out.println(getName() + " is " + getState() + " - running " + i);
        }

        System.out.println(getName() + " is " + getState() + " - finished");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            TenThreads thread = new TenThreads();
            System.out.println(thread.getName() + " is " + thread.getState() + " - created");
            thread.start();
        }
    }
}
