/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author deven
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        B obj = new B(){
//            public void show(){
//                System.out.println("Hello");
//            }
//        };
//        
//          B obj = () -> {
//                System.out.println("Hello");
//            };
//        
            B obj = () -> System.out.println("Hello");
            obj.show();
        
        // For lamda expression or inner class
        // JVM is that smart it does not create extra class for it
        // as it creates for Anonymous class
        
        // Stream API -> works with functional Interface
    }
}

// IN JAVA 8 -> these are called functional interface
@FunctionalInterface
interface B{ // SAM -> Single Abstract Method interface
    // Interface having one method
    
    void show();
}

