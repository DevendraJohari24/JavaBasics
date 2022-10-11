package OOPS.MarkerInterface;

public class markerInterface {
    public static void main(String[] args) {
         Demo obj = new Demo();
         if(obj instanceof P){
            obj.show();
         }else{
            System.out.println("No Implements");
         }
    }
}

interface P
{

}

class Demo implements P{
    void show(){
        System.out.println("Hello");
    }
}

// Interface having No Methods -> Marker Interface

// -> Why we need It?

// a class Demo having a method show() prints Hello
// what we have to do if we have permission only then it has to print hello
// we make and interface with no methods
// and implements the class by it
// so we can check that if it implements that interface then only
// we can print hello
// we can use keyword instanceOf to check


// Example 
// Serializable
// Remote