package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertyFiles {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        

        // OutputStream os = new FileOutputStream("dataConfig.properties");

        // p.setProperty("url", "localhost:3306/mydb");
        // p.setProperty("uname", "Devendra");
        // p.setProperty("pass", "devendra");
        // p.store(os, null);
    
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("pass"));
    
    }
    
}

// Every property file have a key and value
// url, uname, pass
// Properties class has key value thing as it extends hashable class