package String;

public class toStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Dev");
        System.out.println(s1.rollno);
        System.out.println(s1.sname);
        System.out.println(s1);
        // It will print some gibberish in the last -> as every class in java extends Object class
        // this will call by default call toString method
        // It will print name of the class and hash code so that's gibberish is hashcode
        // we can override that method
    }
}


class Student {
    int rollno;
    String sname;
    public Student(int rollno, String sname){
        this.rollno = rollno;
        this.sname = sname;
    }
    public String toString(){
        return rollno + " : " + sname;
    }
}