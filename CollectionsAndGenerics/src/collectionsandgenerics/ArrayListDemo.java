/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.ArrayList;

/**
 *
 * @author deven
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(50);
        v.add(56);
        v.add(55);
        
        for(int i: v){
            System.out.println(i);
        }
        
        
    }
}
