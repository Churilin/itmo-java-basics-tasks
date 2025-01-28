package lesson13_threads.Task3;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CountDownLatch latch = new CountDownLatch(100);

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
                latch.countDown();
            });
            threads[i].start();
        }

        latch.await();

//        for (Thread thread : threads) {
//            thread.join();
//        }

        System.out.println("Final count: " + counter.getCount());
    }
}
