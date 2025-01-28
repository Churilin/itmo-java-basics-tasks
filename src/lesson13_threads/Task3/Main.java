package lesson13_threads.Task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
