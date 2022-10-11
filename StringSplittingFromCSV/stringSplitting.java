package StringSplittingFromCSV;

public class stringSplitting {
    public static void main(String[] args) {
        String str = "Navin, Mahesh, Rahul, Vijay";
        // str string is mutable
        // It does not mean we can not assign a new value like
        // str = "Hello"
        // It will create new set of values in string bool


        // StringBuffer -> mutabilty
        // String -> immutable  
        String names[] = str.split(",");
        for (String val: names){
            System.out.println(val);
        }
    }
}
