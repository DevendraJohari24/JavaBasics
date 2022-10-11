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
public class CurrentTimeMillis {
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis(); // millis from 1 Jan , 1970
        ArrayList a = new ArrayList();
        
        for(int i=1; i<=100000; i++){
            a.add(i);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(end - start);
    }
}
