package OOPS.Interface;

public class extendImplement {
    public static void main(String[] args) {
        
    }
}
// Following thing is not possible ... if we see it seems logically possible but the thing is 
// we can't override Object class methods inside interface   -> It gives error
// interface K{
//     default boolean boolean equals(Object obj){

//     };
// }


interface I {
    default void show(){
        System.out.println("I");
     }   
}

interface J{
    default void show(){
        System.out.println("J");
    }
}

class A{
    void show(){
        System.out.println("A");
    }
}

// Third rule
// default will have low priority and Class methods haave more priority

// class C extends A implements I{

// }