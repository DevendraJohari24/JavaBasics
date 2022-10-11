/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8streamapi;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author deven
 */
public class MethodRefrence {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        
        values.forEach(System.out::println);
        
        values.forEach(MethodRefrence::doubleit);
    }
    
    public static void doubleit(int i){
         System.out.println(i*2);
    }
}
// Method refrence -> two colons
// Call by method -> passing a method by refrence -> java support

