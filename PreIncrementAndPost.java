public class PreIncrementAndPost {
    public static void main(String[] args) {
        int i=5;
        // Behind the scenes
        // int temp;
        // temp = i;
        // i++;
        // i = temp;
        i = i++;
        System.out.println(i);
    }
}
