/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsdemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author deven
 */

/*
Creating own Annotation
*/

// Marker Annotation -> having no variable
//@interface SmartPhone{
//
//}

// Single Value Annotation
//@interface SmartPhone{
//    String os();
//}


// Multivalue Annotation

// Meta Annotation -> TArget and retention
@Inherited  // inherited for future sub classes
@Documented // create documentation
@Target(ElementType.TYPE)       // on what level we are using this annoatation
@Retention(RetentionPolicy.RUNTIME) // till what point you use this annotation
@interface SmartPhone{
    String os() default "Android";
    int version() default 10;
}

@SmartPhone(os="Android", version=6)
class NokiaASeries{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
    
    
}
public class CustomAnnotationDemo {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire", 5);
        
        Class c = obj.getClass();   // Reflection API
        
        // Annotation -> subclass of Annoation 
        // Annotation -> interface
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.os());
    }
}
