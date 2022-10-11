package OOPS.Abstraction;

public class abstractClass {
    public static void main(String[] args) {
        // Can not instatiate object of Abstract class
        MaheshPhone obj = new SureshPhone();
        obj.call();
        obj.cook();
        obj.move();
        obj.dance();
    }   
}

abstract class MaheshPhone{ // Abstract Class
    public void call(){
        System.out.println("Calling....");
    }

    public abstract void move(); // Abstract Methods
    public abstract void dance();
    public abstract void cook();
}

// compulsory to define all these methods that you extract from abstract class
abstract class RameshPhone extends MaheshPhone{
    public void move(){
        System.out.println("Moving....");
    }
}

class SureshPhone extends RameshPhone{ //Concrete class
    public void dance(){
        System.out.println("Dancing....");
    }
    public void cook(){
        System.out.println("Cooking...");
    }
}

// We can use superclass name as refrence and subclass for instantiation
