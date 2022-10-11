package OOPS.Interface;

public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}

// Invention
// that are created by you

// Discovery
// -> animals -> that are already present


interface A{

}

interface B{

}

class C implements A, B {

}


// Multiple Inheritance not possible
// Diamond Problem
// -> Class A and Class B and both class has show method() 
// and we have class C and it extends both the classes.
// It will confuse which show method it has to class

// how  interface help 
// interface assure that you have to implement that show method compulsory 
// in the class who implements that A and B interface
// There is no need to override this method
// one class can implements two interfaces in Java

// in java 8 we also have same condition 
// as we can define method inside interface using default keyword
// then to overcome this problem we have mandatory condition to define 
// that show methon in the class who implements both of the interfaces

