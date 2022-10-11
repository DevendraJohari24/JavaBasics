
// System - Class
// out-> prebuild Object 
// print -> method

// static -> belongs to class non static -> belongs to objects
// Everything SHould be as Class

// Why Static Main??

// call any method in java we required objects
// main is starting point of the execution you cannot call main without object
// and you can not get object without main so thats the deadlock there.
// To solve that deadlock we declare it static



class helloWorld
{
        
    public static void main(String a[]){
        System.out.print("Hello");

    }

}
