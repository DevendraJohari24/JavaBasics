package OOPS.Constructor;

public class constructorJava {
    public static void main(String[] args) {
        A obj = new A();

    }
}

class A{
    int i;
    float f;
    public A(){ // default constuctor
        i = 5;
        f = 5.5f;
        System.out.println("i -> " + i + " F -> " + f);
    }
    // if you dont mention there will be consturctor in class
    // Constuctor -> member method
    // -> same as the class name
    // -> never return anything -> public
    // used to allocate memory to the object
    // It will call automatically , you dont have to call
    // Constuctor Overloading
    // We can also go for implicit conversion in Constructor
    // as double constructor can take int value if not present int constructor
    // but reverse not possible
}
