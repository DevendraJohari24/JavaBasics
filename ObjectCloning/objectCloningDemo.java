package ObjectCloning;
public class objectCloningDemo {
    public static void main(String[] args) {
        /*
         * lets class having two variables let int i int j
         * create an object of this class and initialize it with some class
         * obj.i =5 
         * obj.j=6
         * now you want to create another object which is copy of this
         * 
         * 
         * 
         * 
         * 
         * 
         * # two types of copies
         * -> Shallow Copy
         * A obj = new A();
         * obj.i  = 5
         * obj.j = 7
         * 
         * A obj1 = obj
         * 
         * So what's thing is there 
         * It's basically create only one object in heap and in stack it stores same refrence or hashcode in front of both the objects
         * Now if we change the value of obj1 it will reflect in obj
         * 
         * 
         * Deep Copy
         * 
         * -> Two objects A obj = new A();
         * -> A obj1 = new A();
         * 
         * obj.i = 5;
         * obj.j = 6;
         *  
         * 
         * obj1.i =obj.i;
         * obj1.j = obj.j;
         * 
         * 
         * 
         * -> Cloning
         * A obj = new A();
         * obj.i=5;
         * obj.j=6;
         * 
         * A obj1 = obj.clone();
         * 
         * --- 
         */
    }
}
