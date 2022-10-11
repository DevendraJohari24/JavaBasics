/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8streamapi;

/**
 *
 * @author deven
 */
public interface Actor {
    void act();
    void speak();
    default void comedy(){
        System.out.println("I can make ppl laugh");
    }
}


// we can use default keyword to define the methodin the interface

// forEach comes from Iterable which is default