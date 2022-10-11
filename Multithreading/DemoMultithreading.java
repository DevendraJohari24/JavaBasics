package Multithreading;

public class DemoMultithreading {
    public static void main(String[] args) {
        
        // In side one process we have some sub processes or units 
        // which is call threads

        // for example -> while typing it is also checking grammer

        // by defult in every java application there is one thread
        //  main -> thread

        // There are multiple core processors in the CPU.
        // so only one thread can take one core of CPU
        // let say there are 4 core processor
        // and one core take 2second
        // so doing the work which takes 8 sec on single core
        // now it takes only 2second in Quad core processor


        // let say you are using amazon Request goes to the server 
        // In that second your app is not freeze it can be used
        // So there are two threads use one for client to server request
        // and same time other thread can work other app function
        // Async await -> use to create that thread for sending request


        // It is also used to access web applications

        // in games when everything happens at  same time


        // you dont have to call thread it will automatically call run when you use start method

        // run -> call 
        // start -> create a new thread
        // sleep -> static method shich takes mili second used to wait for few seconds
        // wait & notify 
        // stop -> stop the thread

        // One more way to create the thread 
        // -> Runnable Interface
        

    }
}
