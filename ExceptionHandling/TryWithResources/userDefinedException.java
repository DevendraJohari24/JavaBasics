package ExceptionHandling.TryWithResources;

public class userDefinedException {
    public static void main(String[] args) {
        int i=5;
        try{
            if(i<10){
                throw new Exception("Errrooorr");
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
        // Print somethingg with error you need contructor of that method
        
    }
}