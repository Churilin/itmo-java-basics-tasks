package lesson13_threads.Task3;

//Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу count должен быть равен 100000 при каждом запуске программы.

//public class Counter extends Thread {
//
//    private volatile int count = 0;
//
//    public void increment() {
//        count = count + 1;
//    }
//
//    public int getCount() {
//        return this.count;
//    }
//
//    @Override
//    public void run() {
//        Thread.yield();
//        for (int i = 0; i < 1000; i++) {
//            count = count + 1;
//        }
//        System.out.println(getCount());
//        System.out.println(Thread.currentThread().getName() + " - finished");
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Counter counter = new Counter();
//        for (int i = 0; i < 100; i++) {
//            Thread thread = new Thread(counter);
//            thread.start();
//            thread.join();
//        }
//        System.out.println(counter.getCount());
//    }
//}

class Counter {

    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}


