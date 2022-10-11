/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author deven
 */

public class ComparatorDemo {
    public static void main(String[] args) {
         List<Integer> values = new ArrayList<Integer>();
        values.add(30);
        values.add(99);
        values.add(72);
        values.add(2);
        values.add(70);
        
        System.out.println(values.get(1));
        
        
        // Comparator is an interface so we can not create objectof Camparator
        
//        Comparator<Integer> com = new ComparatorImpl();
        
        Comparator<Integer> com = (a1, a2) -> {
            return a1%10>a2%10 ? 1: -1;
//            if(a1%10 > a2%10){
//                return 1;
//            }
//            else return -1;
        };

        Collections.sort(values, com);
        
        
        values.forEach(System.out::println);
    }
}
