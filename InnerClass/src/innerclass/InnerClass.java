/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innerclass;

/**
 *
 * @author deven
 */
public class InnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj = new A();
        obj.i = 5;
        // how to access j
        // we need obj of B
        // no one find B here
        
        // after compilation
        // we have two classes
        // A.class
        // A$B.class
        
//        A.B obj1 = obj.new B(); -> when inner class is not static

        // Static Inner Class
        
        A.B obj1 = new A.B();  // since it is static we dont require object of static class
        
        // Anonymous Inner Class
        
//        Phone obj2 = new SmartPhone();
//        obj2.show();
        
        // first create object then create the Implementation
        // Discovery
//        Phone p = new Phone(){
//            public void show(){
//                System.out.println("Call, SMS, ....");
//            }
//        };
//        
//        p.show();
        
        
        
        // Java 8  Features
        // Using Lambda
        
        Phone p = () -> System.out.println("SMS, cell");
        
    }
}


// Inner Class
// Class inside a class is Inner Class


// Inner Class -> 
    // Member Inner Class
    // Static Inner Class
    // Anonymous Inner Class


//class A{
//    int i;
//    class B{
//        int j;
//    }
//}

class A{
    int i;
    static class B{
        int j;
    }
}


//class Phone{
//    public void show(){
//        System.out.println("Call");
//    }
//}
interface Phone{
    void show();
}


//class SmartPhone extends Phone{
//    public void show(){
//        System.out.println("Call, SMS, Camera");
//    }
//}