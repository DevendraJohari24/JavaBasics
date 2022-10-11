/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package annotationsdemo;

import java.util.ArrayList;

/**
 *
 * @author deven
 */
@FunctionalInterface
interface Abc{
    void show();
    
}


class A{
    public void showMyDataFromLastYearDatabase(){
        System.out.println("In A");
    }
}

class B extends A{
    @Deprecated
    public void show(){
        
    }
    @Override // it check compile time stuff and works as comment for programmers
    @SuppressWarnings("unchecked")
    public void showMyDataFromLastYearDatabase(){
        ArrayList obj = new ArrayList();
        System.out.println("in B");
    }
}
public class AnnotationsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B obj = new B();
        obj.showMyDataFromLastYearDatabase();
    }
    
}
// sometimes names of the override methods are too big 
/*
And it's tough to write exact name 
and errors often occurs in writing
so what can we do we use Override annotation to save ourself from RunTime Errors


*/