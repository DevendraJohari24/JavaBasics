/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author deven
 */

//interface MobileCompany{
//    static String APPLE = "Apple";  // constant
//    static String BANANA = "banana";
//}

enum Mobile{
    APPLE(100), SAMSUNG(90), HTC;
    int price;
    
    // We can use constructor also in this enum
    
    Mobile(){
        price = 80;
        System.out.println("Constructor");
    }
    
    Mobile(int p){
        price = p;
    }
    
    public int getPrice(){
        return price;
    }
}

// Behind the scenes
//
//class Mobile{
//    static final Mobile APPLE = new Mobile();
//    static final Mobile SAMSUNG = new Mobile();
//    static final Mobile HTC = new Mobile();
//}

/*
So is it possible to create method inside enum
Answer -> yes
// so that's how it is different from C++, C


Enum extends class Enum -> which implements Serializable and Comparable
Enum -> abstract class
ordinal -> method prints order of the enum 
*/


public class EnumExample {
    public static void main(String[] args) {
//     if(MobileCompany.APPLE == "Apple"){
//         
//     }   
// We should know what kind of constant we working with
// so we use enum

        System.out.println(Mobile.APPLE);
       
        Mobile m = Mobile.APPLE;
        
        System.out.println(Mobile.APPLE.getPrice());
        System.out.println(Mobile.APPLE.ordinal());

        switch (m){
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("1st copy of Apple");
                break;
            case HTC:
                System.out.println("HTC");
                break;
        }
        
        Mobile k[] = Mobile.values();
        // values -> method that is given by compiler
        // Enum class extends object class
        // extends class not used in enum
        // implement interface work in enum
        for(Mobile mobile: k){
            System.out.println(mobile);
        }
    }
}

// Difference of Enum in JAva from other languages

// We can define enum inside the class or outside the class
// but not inside the method



// Enum -> is not there in first version of JAva

/*

want to represent some constant i.e. range of integers
when you have your own range



*/