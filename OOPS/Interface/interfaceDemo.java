package OOPS.Interface;

interface Abc{
    void show();
}

/*
 * MArker Interface -> interface without any methods
 * SAM -> Single Abstract method -> functional Interface
 * Normal 
 * 
 */

public class interfaceDemo {
    public static void main(String[] args) {
        Abc obj = new Abc(){ // Anonymous Class
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
        Abc obj2 = () -> System.out.println("In show 2"); // lambda expression introduced in 1.8
        // same as in first statement
        obj2.show();
    }

}


