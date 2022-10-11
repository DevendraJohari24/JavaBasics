package ExceptionHandling.TryWithResources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class tryWithResources {
    public static void main(String[] args) throws InputMismatchException {
        // try block with resource
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str = "";
        str = br.readLine();
        }
        catch(Exception e){
            System.out.println(e);
        }
        int k=6;
        if(k < 10){
            throw new ArithmeticException();
        }
    }

}

// Two ways
// Ignore the error
// or handle the exception


// throw or throws -> keyword in java used to supress the errors.

// throws should be write after the method