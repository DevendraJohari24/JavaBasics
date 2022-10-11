package StringSplittingFromCSV;

public class mutabilityString {
    public static void main(String[] args) {
        // Mutability is crime and we all are criminal
        // Make a object immutable increase performance 
        // that's why string is immutable


        // In heap memory -> String Pool
        // when a string is declare
        String str = "Devendra";
        String str2 = "Devendra";

        // Stack
        // str -> 101
        // str2 -> 101

        // Heap -> String Pool
        // 101 -> Devendra

        // Does not create another object


        str = "Johari";
        // Heap -> String Pool
        // It does not change existing value it creates new value
        // 101 -> Devendra
        // 103 -> Johari

        // Stack
        // str -> 103
        // str1 -> 101

        String s1 = new String("Devendra");
        // this new is also use the memory of String Pool indirectly
        // The Heap having -> object and its address as 101

        // Flyweight concept -> this is why both object share the same refrence
        
    }
}


