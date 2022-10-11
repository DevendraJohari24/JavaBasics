package Multithreading;

class Counter
{
    int count;
    public synchronized void increment(){
        count++;
    }
}



public class SyncDemo {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        
        Thread t1 = new Thread(()->{
            for(int i=1; i<=10000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=10000; i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count " + c.count);
    }
}

// Both the thread accessing the count at the same time and that is the issue
// that's why our result is not 20000 
// Because one or more than time the value for count is same for both
// so  what's solution
// if we make that method synchronized then only one method can access it at a time
