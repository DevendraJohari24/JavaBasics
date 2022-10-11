package OOPS.Final;

public class finalDemo {
    public static void main(String[] args) {
        
    }
}


// final -> once it is assigned it never change
// once the value is assigned it will never change again

class A{
    final public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){ // shows error if we override show method as it is declared final
        System.out.println("In B show");
    }
}

// if a class is final then no other class extends it
// final with variable
// final with class
// final with method