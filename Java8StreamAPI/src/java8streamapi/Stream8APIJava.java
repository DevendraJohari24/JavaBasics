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
public class Stream8APIJava {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        
        System.out.println(values.stream().filter(i -> i%5==0).map(i->i*2).findFirst().orElse(0));
    
//        int result=0;
//        for(int i: values){
//            if(i%5 == 0){
//                result = i*2;
//                break;
//            }
//        }
// Looks more Efficient but not

// findFirst -> Terminal Method
 
        System.out.println(values.stream().filter(Stream8APIJava::isDivisble).map(Stream8APIJava::mapDouble).findFirst().orElse(0));

    }
    
    public static boolean isDivisble(int i){
        System.out.println("in isDvs " + i);
        return i%5==0;
    }
    
    public static int mapDouble(int i){
        System.out.println("is MapDouble " + i);
        return i*2;
    }
}
