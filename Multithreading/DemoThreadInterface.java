package Multithreading;

class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500); // wait the thread
            } catch (Exception e) {
            }
        }
    }

}

class Hello implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class DemoThreadInterface {
    public static void main(String[] args) {
        // one thread -> main thread
        System.out.println("Good");
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
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

    }
}
// excute them paralley if both threads independents


// Runnable -> functional Interface 
// and have only one method -> run();
// Don't have start in runnable
//So what we can do here
// create thread object of thread class