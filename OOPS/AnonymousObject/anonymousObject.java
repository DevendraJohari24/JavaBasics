package OOPS.AnonymousObject;

public class anonymousObject {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        new A().show(); // Anonymous Object
    }
}


// Anonymous Object -> Object That dont have any refrence
// So this kind of object doesnot stores in stack . It only takes space in the heap
// Garbage cleaning automatically done because it is eligible for garbage collection because it has no refrence as not stored in stack

class A
{
    int i=5;
    public void show(){
        System.out.println("Hello " + i);
    }
}
