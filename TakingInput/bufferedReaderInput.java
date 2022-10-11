package TakingInput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class bufferedReaderInput {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a Number");

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);
        // readLine() returns string
        // so we have to convert it into a integer using parseInt which is a static method of Integer class
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(n);
    
    }

}
