/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcbasics;

/**
 *
 * @author deven
 */
public class DemoClass {
    public static void main(String[] args) throws Exception{
        Class.forName("Pqr");  // only execute static block -> only to load the class
//        Class.forName("Pqr").newInstance(); //Create the  instance
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");// It is same as above
    }
}


class Pqr
{
    static{ //will be executed once we load the class
        System.out.println("In static");
    }
    // instance class
    {
        System.out.println("In Instance");
    }
}