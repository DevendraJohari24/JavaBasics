/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.Vector;

/**
 *
 * @author deven
 */
public class VectorDemo {
    public static void main(String[] args) {
        // Vector is dynamic array in which we increase size of the array
        // It will increase the capacity with 100%
        // Implementation of List Interface
        // vector is there for long time
        // later it is modify to work with List
        
        // When to use ArrayList and Vector
        // Vector waste so much memory as capacity while Array list not
        // ArrayList -> 50%
        // Vector -> 100%
        // Vector methods are theoretically synchronised and thread safe
        // Array List fast
        // Vector slow due to synchronised
        Vector<Integer> v = new Vector<Integer>();
        v.add(4);
        v.add(5);
        v.add(29);
        v.add(59);
        v.add(89);
        v.add(78);
        v.add(55);
        v.remove(7);
        System.out.println(v.capacity());    
        for(int i: v){
            System.out.println(i);
        }
    }
}
