package Reflection_API;


// interface A{
 //   returns true if interface and if class returns false
// }

class Abc{

}

class A extends Abc{

}
public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Reflection_API.A");
        System.out.println(c.isInterface());
        System.out.println(c.getSuperclass());

    }
}
