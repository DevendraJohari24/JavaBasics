package TakingInput;

public class usingRead {
    public static void main(String[] args) throws Exception {
        // // Two Ways
        // // Scanner
        // // BufferedReader

        // // -> out method of PrintStream class
        // System.out.print("");

        int i = System.in.read(); 
        System.out.println(i);
        // It is taking value as a character and converting it into ascii character
        // We can typecast it
        System.out.println((char) i);

        // drawbacks of Read
        // only take an integer at a time
        String str = "";
        while((i= System.in.read())!=48){
            str = str + (char)i;
        }

        System.out.println(str);
    
    }
}
