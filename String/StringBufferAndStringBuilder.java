package String;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        // StringBuffer & StringBuilder-> provides string mutability
        StringBuffer sbf = new StringBuffer("Devendra");
        sbf.append("Reddy");
        char x = sbf.charAt(0);
        System.out.println(sbf);
    }
}

// StringBuffer vs StringBuilder

// StringBuffer -> thread-safe 
// safe for use by multiple threads


// StringBuilder
// not threadsafe
// doesnot provide you synchronisation



