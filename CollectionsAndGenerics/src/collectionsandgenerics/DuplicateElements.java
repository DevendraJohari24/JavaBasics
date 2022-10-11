/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author deven
 */
public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Navin");
        names.add("Mangesh");
        names.add("Rahul");
        names.add("Mangesh");
        Set<String> s = new HashSet<>();
        
        for(String name : names){
            if(s.add(name)==false){
                System.out.println(name);
            }
        }
    }
}
