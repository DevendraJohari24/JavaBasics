package ObjectCloning;

public class cloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;

        Abc obj1 = obj;
        System.out.println(obj);
        System.out.println(obj1);

        Abc obj2 = (Abc)obj.clone();
        System.out.println("Cloning.....");
        System.out.println(obj2);
        obj2.i=7;
        obj2.j=10;
        System.out.println(obj2);

    }
}

// By default clone method is protected so we have to call it on extended class
// as all the classes extends Object class
// and that clone method of object class is throwing an error name as CloneNotSupportedException
// so we have to throw it
// Java won't allow it to clone of a object provided you give such permission to that object to clone 
// as if any hacker get that state it can easily get credentials
// so we can give permission using implements Cloneable interface
// which is marker Interface

class Abc extends Object implements Cloneable{
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc( " + "i=" + i + ", j= " + j + "}";
    }


    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
