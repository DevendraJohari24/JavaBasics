package Array;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5, 6, 7, 8);
        obj.show(10);

    }
}

class Display{
    public void show(int ... a){
        for(int i: a){
            System.out.println(i);
        }
    }
    public void show(int a){
        System.out.println("Value in Show" + a);
    }
}