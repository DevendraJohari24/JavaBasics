package StaticDemo;

public class staticDemo {
    public static void main(String[] args) {
        // Abc.i = 5;
        Abc.show();
    }
}

// Static methods dont need object creation 
// dont want to instantiate the class 
// we can not use non static variable inside static method


class Abc{
    static int i=0;
    public static void show(){
        System.out.println("Hi");
        System.out.println(i);
    }
}


// Why we Can not use non static variable in static methods
/*
 * Variable are of two types
 * Static -> need class to call variables and methods
 * Non static -> need object(instance) to call variables and methods
 * 
 * For all the object there is same value of staic variable
 * All the object share the same value of static variable but they have their own value of instance variable
 * 
 * Every object has its own value and when we try to change it in static methods that's not possible we are not sure
 * which of the objects value is changing
 */