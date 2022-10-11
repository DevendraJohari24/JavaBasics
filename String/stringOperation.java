package String;

import java.util.Scanner;

public class stringOperation {
    public static void main(String[] args) {
        //
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings");

        s1 = sc.nextLine();
        s2 = sc.nextLine();

        String s3 = s1.concat(s2); // s1 + s2
        System.out.println("Concatenation : "+s3);


        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println("Length of first string " + l1);
        System.out.println("Length of second string " + l2);
        s1 = s1.toUpperCase();

        System.out.println("Uppercase " + s1);
    }
}
