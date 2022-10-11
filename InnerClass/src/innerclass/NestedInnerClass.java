/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author deven
 */
public class NestedInnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B obj = new A.B();
        obj.show();
    }
}

class A{
    int rollno; // Member variable or objects
    String sname;
    
//    public void show(){ // Member Method
//        System.out.println("Hello");
//    }
    
    static class B{
        public void show(){ // Member Method
         System.out.println("Hello");
     } 
    }
}