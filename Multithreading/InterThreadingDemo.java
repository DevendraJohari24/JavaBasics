package Multithreading;

class Q{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        while(valueSet){
            try{
                wait();

            }catch(Exception e){}
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();

    }
    public synchronized void get(){
        while(!valueSet){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println( "Get : " + num); 
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable
{
    Q q;
    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){

            }
        }
    }
}

class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run(){
        while(true){
            q.get();
             try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}

public class InterThreadingDemo {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
// Whenever you use wait -> method should be synchronized
// so there are no conflict
// we have to notify the producer that consumer is get the value
// and same producer also notify that to consumer that the value is set

// so if it is timing mismatch It will wait for the other one

// here wait() & thread() method -> belongs to Object class

// Because the wait on the thread is done with the help of object
// sleep() - > thred method
