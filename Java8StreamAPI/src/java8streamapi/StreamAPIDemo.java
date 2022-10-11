/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author deven
 */
public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for(int i=1; i<=100; i++){
            values.add(i);
            
        }
        values.stream().filter(i-> {
            System.out.println("Hello");
            return true;
        }).findFirst();
//        values.forEach(System.out::println);
        
        /*
        -> values.stream() -> convert normal list to stream of values
        // We can actually use parallel stream
        // just use parallelStream() -> to use multithread
        
        // stream has lots of methods to use->
            // once the value is used it can not reused that's why it is stream
        // 
        filter
        // This method is intermediate method that's why it can not print any output
        // also known as Lazy Evaluation
        // 
        // FindFirst method -> gives you optional value -> Terminate Method
        // 
*/
        List<Integer> value = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Stream<Integer> s = value.stream();
//        s.forEach(System.out::println); // will work
//        s.forEach(System.out::println); // will give Exception
//    }
        
        System.out.println(value.stream().map(i -> i*2).reduce(0, (c, e)-> c + e));
        System.out.println(value.stream().map(i -> i*2).reduce(0, Integer::sum));
    }
}