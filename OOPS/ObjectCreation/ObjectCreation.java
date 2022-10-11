package OOPS.ObjectCreation;

public class ObjectCreation {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

class A{ // Every class in Java Extends of Object Class so it is also called super() class
    public A(){
        System.out.println("In A Const");
    }
    public A(int i){
        System.out.println("In A Const Int");
    }
}

// refrence of super class and object of sub class

class B extends A{
    public B(){
        super(); // automatically called this line
        System.out.println("In B Const");
    }
    public B(int i){
        super(); // auto matically called default constructor of super class
        System.out.println("In B Const Int");
    }
}
