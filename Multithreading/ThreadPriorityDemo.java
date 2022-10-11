package Multithreading;


public class ThreadPriorityDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500); // wait the thread
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        // new Thread(Runnable Object, Name of thred);
        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // Priority ranges from 1-10 1->least 10->highest
        // normal priority -> 5

        t1.setPriority(1);
        // t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(10);
        // t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // Luckily Thread constructor wants Object of Runnable
        t1.start(); // create the thread
        // whenever it starts it internally run (run method)
        // so we have to call run
        t2.start();

        // Run is internal method of thread
        // so whenever you create the thread
        // It is your responsibility to override run method

        // There is issue->
        // when both thread reaches at the same time
        // Scheduler -> So it choose one of thread between them at random order
        // System.out.println("Bye"); // if we write this we got Bye in starting... its
        // because main thread and main thread dont have job and it prints rest of the
        // part

        // SO we have to tell main when both of thread finish their job then it will
        // print this

        // Join method use
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
// excute them paralley if both threads independents

// Runnable -> functional Interface
// and have only one method -> run();
// Don't have start in runnable
// So what we can do here
// create thread object of thread class