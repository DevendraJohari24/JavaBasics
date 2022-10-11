/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author deven
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(30);
        values.add(99);
        values.add(72);
        values.add(2);
        values.add(70);
        
        System.out.println(values.get(1));
        
        Collections.sort(values);
        
        values.forEach(System.out::println);
    }
}
