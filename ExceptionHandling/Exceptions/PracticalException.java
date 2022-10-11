package ExceptionHandling.Exceptions;

public class PracticalException {
    public static void main(String[] args) {
        int i, j, k=0;
        i=8;
        int a[] = new int[4];
        j=2;
        try{
            k = i/j;
            for(int c=0; c<=4; c++){
                a[c] = c+1;
            }
            for(int value : a){
                System.out.println(value);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(IndexOutOfBoundsException iob){
            System.out.println("Index out of bound");
        }
        catch(Exception e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            // Even if error comes it definitely run these lines of code
            System.out.println("Bye");
        }
    }
}


// Throwable
    // Exception
        // - Checked 
                // - IOException
                // - SQLException
        // - Unchecked
                // - RuntimeException
                        // - ArrayOutOfBound
                        // - Arithmetic Exception
    // Error


// finally -> 
// Block of code you want to be must excuted