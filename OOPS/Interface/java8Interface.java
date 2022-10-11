package OOPS.Interface;

public class java8Interface {
    public static void main(String[] args) {
        
    }
}


interface I{
    // only abstract methods
    void add();
    default void show(){

    }
}

abstract class Abc{
    // we make them abstract as well as normal methods
}

// Java 8
// Stream API 
// -> stream() -> List collection
// 

// How to define method inside interface

// we have to mention default keyword 
