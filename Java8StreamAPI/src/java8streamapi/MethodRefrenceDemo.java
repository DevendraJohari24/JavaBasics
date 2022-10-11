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
public class MethodRefrenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Manoj", "Priya", "Ant");
        
        names.forEach(System.out::println);
    }
}
