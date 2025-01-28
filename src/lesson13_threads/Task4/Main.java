package lesson13_threads.Task4;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();
        ThreadName nameThread = new ThreadName(obj);
        ThreadName nameThread1 = new ThreadName(obj);
        nameThread.start();
        nameThread1.start();
    }
}
