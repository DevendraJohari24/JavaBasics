package Wrapper;

import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
        int i=5; //Value
        Integer ii = new Integer(i); // Object // Boxing
        ii.intValue();
        Integer jj = i; // AutoBoxing

        int j = jj.intValue();  // Unboxing
        int k = jj; // AutoUnBoxing
        System.out.println(j);

        ArrayList<Integer> values = new ArrayList<Integer>();


        // Collections like ArrayList only work with Integer class not with int variable
        
    }
}



// Java is 99.99% Object oriented
// But 0.one percent not -> Primitive Data Type

// primitive types derived from c language
// -> int i, float i should be object as Java is OOP language but it's not
// It's primitive variable
// That's why Wrapper Class comes..
// Integer -> Integer Obj = new Integer(); -> It's and object


// These type of classes for all primitive types are called wrapper class

// Wrapping and UnWrapping
// int i=5;
// Integer obj = new Integer(i);
//Taking a variable and put it into a wrapper class -> wrapping
// Taking out a variable from its wrapper is called unwraping


// int j = Obj.intValue();