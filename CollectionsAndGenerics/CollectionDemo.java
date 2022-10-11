// package CollectionsAndGenerics;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;

// public class CollectionDemo {
//     public static void main(String[] args) {
//         // int values[] = new int[4];
//         // Object values1[] = new Object[4];
//         // values1[0] = "Devendra";
    
//         // but they are of fix size
//         // Collection -> interface

//         // Collection values = new ArrayList();
//         Collection<Integer> values = new ArrayList<Integer>();

//         // This concept of mentioning what type of data you have in your Collections


//         values.add(3);
//         // values.add("Navin");
//         // values.add(5.8f);
//         values.add(50);
//         // Two ways to fetch the collection
//         values.add(45);

//         // -> Iterator
//         // -> Enhanced forloop

//         Iterator it = values.iterator();

//         while(it.hasNext()){
//             System.out.println(it.next());
//         }
//         // System.out.println(it.next());

//         // enhanced for loop
//         // for (Object i : values)
//         for(int i: values){
//             System.out.println(i);
//         }
//     }
    
//     Container<T> obj = new Container<>();
    
// }


// // Generics

// // E -> Type of Element
// // T -> USed to defind Type
// // Generics -> only support Classes 
// // ? -> ? extends Number

// //?-> replace by some other class


// class Container<T extends Number>{
//     T value;
//     public void demo(ArrayList<? extends T> obj){]
//     }
// }

// // we can use super instead of extends

