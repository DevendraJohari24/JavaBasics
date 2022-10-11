package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) throws Exception {
        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(2);
        values.add(88);
        values.add(7);

        System.out.println(values.get(1));
        Collections.sort(values);
        values.forEach(System.out::println); // Stream API .....Lambda Expression
        // List extends Collection
        // and have a add function which can add the element in between
        // ArrayList implements List

    }
}
