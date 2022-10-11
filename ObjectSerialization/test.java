package ObjectSerialization;
abstract class Diagram{
    public String name;
    public Diagram (String d){
        name = d;
    }
    public String toString(){
        return name;
    }
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
public class circle extends Diagram{
    private double radius;
    private final double PI = 3.14;
    public circle(double r, String name){
        super(name);
        radius=r;
    }
    public String toString(){
        return "A circle of radius" + radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public double calculateArea(){
        return PI*radius*radius;
    }
}
public class test {
   public static void main(String[] args) {
    
   }
}
