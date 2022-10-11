package OOPS.Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

class A // Method Overloading, Early Binding, Static Binding, Compile Time Polymorphism
{
    public void show(){
        System.out.println("Hello");
    }
    public void show(int i){
        System.out.println("Hello " + i);
    }
    public void show(double d){
        System.out.println("Hello " + d);
    }
}

class B extends A{ // Method Overriding, Late Binding, Dynamic Binding, Runtime Polymorphism
    public void show(){
        System.out.println("In Show B");
    }
}