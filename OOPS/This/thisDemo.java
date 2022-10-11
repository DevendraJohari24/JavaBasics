package OOPS.This;

public class thisDemo {
    public static void main(String[] args) {
        
    }
}

class A{
    private int x; // Instance Variable
    public A(int x){ // local Variable
        this.x = x; // this -> used to tell this variable is not local variable it is belong to current instance
    }

    public void show(){
        System.out.println("x is " + x);
    }
}
