package lesson13_threads.Task4;

// Напишите программу, в которой создаются два потока, каждый выводит по очереди на консоль своё имя.
// Начать можно с написания своего класс-потока, который выводит в бесконечном цикле свое имя.
// Потом придется добавить синхронизацию с помощью wait() и notify().

public class ThreadName extends Thread {

    private final Object obj;

    public ThreadName(Object object) {
        this.obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
            while (true) {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}