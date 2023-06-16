package org.example.june16;

class DeadLock {

    private final Object obj1 = new Object();
    private final Object obj2 = new Object();

    public void thread1() {
        synchronized (obj1) {
            System.out.println("Thread 1 has acquired resource 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj2) {
                System.out.println("Thread 1 has acquired resource 2");
            }
        }
    }

    public void thread2() {
        synchronized (obj2) {
            System.out.println("Thread 2 has acquired resource 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj1) {
                System.out.println("Thread 2 has acquired resource 1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadlock = new DeadLock();

        Thread thread1 = new Thread(deadlock::thread1);
        Thread thread2 = new Thread(deadlock::thread2);

        thread1.start();
        thread2.start();
    }
}
