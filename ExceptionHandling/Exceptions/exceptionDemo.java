package ExceptionHandling.Exceptions;

import java.io.IOException;

public class exceptionDemo {
    public static void main(String[] args) {
        try{
            int j=1;
            int k=0;
            int i = j/k;
        }
        catch(ArithmeticException ae){

        }
        // catch(IOException ie){

        // }
        catch(Exception e){
            // Exception is superclass of all the exceptions 
            // when we dont know what kind of exception class it belongs
        }
    }
}

// Throwable -> super class of all the classes



// only Throwable is the class having able in the end is class
// all others are interfaces


// Errors and Exceptions
// Error can not be handled 
// Exceptions can be handled


// Exceptions
// Opening file
// User Input
// Divide by 0



// Throwable ---> Exception & Error(2 Classes) 
// Exception ---> Checked & Unchecked 
// Checked -> If can handle -> checked
// Unchecked -> if not handled


// Statement  -> Normal & Critical

// Normal = > int i=1;
// Critical -> int i/j; -> what if j is 0;

// So we have to put all the critical statements inside try block



/**

a()
{
    b();
}
b(){
    c();
}
c(){
    // exception throw
    // can handle exception
}



 */

 // If C has throwing an exception -> 
 // two choice
 // C himself can handle it or 
 // throw it using throws or throw keyword to B which is good at handling Exception