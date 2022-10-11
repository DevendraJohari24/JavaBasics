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
public class Runner {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));
        
        Comparator<Laptop> com = new Comparator<Laptop>(){
            public int compare(Laptop l1 , Laptop l2){
                if(l1.getPrice() > l2.getPrice()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        
        
        Collections.sort(laps, com);
//        Collections.sort(laps);
        
        // what if when you use it from third party library
        // then what to do -> use COmparator
        
        // when sort based on some other paramter then use Comparator
        
        for(Laptop lap : laps){
            System.out.println(lap);
        }
        
        
        
        
    }
}
