package OOPS.Super;

public class superDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        B obj2 = new B(5);
        obj2.show();
        obj.abc();
    }
}


class A
{
    int i=5;
    public A(){
        System.out.println("In Class A");
    }
    public A(int i){
        System.out.println("In Para Con A");
    }
    public void abc(){
        System.out.println("A abc");
    }
}

class B extends A{
    int i = 4;
    public B(){
        System.out.println("In class B");
    }

    public B(int i){
        super(i);
        System.out.println("In Para Con B");
    }
    public void show(){
        System.out.println(i);
        System.out.println(super.i);
    }

    public void abc(){
        super.abc();
        System.out.println("B abc");
    }
}
