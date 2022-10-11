/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author deven
 */
public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        
        
        // forEach method accepts value of Consumer Interface Object
        
        Consumer<Integer> c = new Consumer<Integer>(){
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        values.forEach(c);
    }
}


 
// SAM interface -> single Abstract Methoda Interface  -> In java 1.8 it is known as Functional Interface

