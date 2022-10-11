/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author deven
 */
public class AnonymousDemo {
    public static void main(String[] args) {
        B obj = new B(){ // Anonymous
            public void show(){ 
                System.out.println("Hii");
            }
        };
        
        obj.show();
        
    }
}




class B{
       public void show(){ // Member Method
        System.out.println("Hello");
    } 
}
