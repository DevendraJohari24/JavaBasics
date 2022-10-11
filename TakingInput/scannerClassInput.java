package TakingInput;

import java.util.Scanner;

public class scannerClassInput {
    public static void main(String[] args) {
        String str="";

        Scanner sc = new Scanner(System.in);
        
        str = sc.nextLine();
        int i;
        i = Integer.parseInt(sc.nextLine());
        // i = sc.nextInt();
        System.out.println(str);
        System.out.println(i);

    }
}
