package OOPS.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        A obj = new B(); // using refrence as A interface we can restrict user to use methods that are declared other than inside interface
        obj.show();
    }
}


// In order to use java to support multiple inheritance 
// We use Interface
// In interface you can not define the method
// can not create the object of interface
// we use implements instead of extends 
// Can not create constructor can not define definition of anything
// But we can create refrence


interface A{
    public void show();
}

class B implements A
{
    public void show(){
        System.out.println("Hello World");
    }

    public void display(){
        System.out.println("Hi");
    }
}

