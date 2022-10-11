package OOPS.StaticMethods;

public class staticMethods {
    public static void main(String[] args) {
        I.show(); // we can directly call that method
    }
}
// In JAva 8 it supports static methods

interface I
{
    static void show(){ // only work in 8 not in 1.7
        System.out.println("Hi");
    }
}
