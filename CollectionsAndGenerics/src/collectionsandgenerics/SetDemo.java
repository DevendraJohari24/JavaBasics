/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author deven
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        
        // Set -> interface
        // Hashset class implements set
        
        System.out.println( values.add(5));
        values.add(6);
        values.add(8);
        values.add(9);
        System.out.println(values.add(9));

        for(int i: values){
            System.out.println(i);
        }
        // Set has all the unique elements
        // values.add return true and false
        
        // Hashset -> use some algorithm so that nearest value comes first
        // Hashset -> not store in same order
        // TreeSet -> give you data in particular sequence
        
        
        
    }
}
