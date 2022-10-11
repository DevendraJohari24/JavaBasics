package OOPS.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        
    }
}

class Add{  // Parent, Super, Base
    int num1, num2, result;
    public void sum(){
        result = num1 + num2;
    }
}
// Child , Sub, Derived
class AddSub extends Add{ // Single Level Inheritance
    public void sub(){
        result = num1 - num2;
    }
}

class AddSubMult extends AddSub{ // Multi Level Inheritance
    public void mult(){
        result = num1 * num2;
    }
}

