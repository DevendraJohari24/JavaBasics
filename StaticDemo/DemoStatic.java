package StaticDemo;

public class DemoStatic {
    // This gets called as soon as your class loaded into JVM
    static{
        // block called when class is loaded
        System.out.println("Hello Inside Static");
    }

    public static void main(String[] args) {
        System.out.println("Hello Inside Main");

    }
    // static called first after that main is called
    static{
        System.out.println("Bye Inside Static 2");
    }
}
