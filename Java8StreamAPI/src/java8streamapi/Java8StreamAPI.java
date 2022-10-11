/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java8streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author deven
 */
public class Java8StreamAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> values =  Arrays.asList(1, 2, 3, 4, 5, 6);
        for(int i=0; i<6; i++){
            System.out.println(values.get(i));
        }
        
        Iterator<Integer> i = values.iterator(); // Are used to print or to update
        System.out.println("Using Iterator");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Enhanced For loop"); // Print all the values
        for(int x : values){
            System.out.println(x);
        }
        
//        External Iterations -> // In 1st for loop -> They fetch value outside
//    Internal Iterations // Using Stream API We achieved Thos
    

// Stream API
// -> they have done lot of modification with Collection interface in jAva 8

        // Internal Iterations
        // -> 
        values.forEach(k -> System.out.println(k));
    }
    
    // In java 8 -> Functional Programming
    // You dont have to focus on how to do
    // just focus on what to do
    
    
    
}
