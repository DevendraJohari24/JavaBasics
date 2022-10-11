/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author deven
 */

class Student implements Comparable<Student>{
    int rollno;
    int marks;
    
    public Student(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", marks=" + marks + '}';
    }
    
    
    public int compareTo(Student s){
        return this.marks > s.marks ? -1 : this.marks <s.marks ? 1 :0;
    }
    
}
public class CollectionsAndGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, 55));
        studs.add(new Student(2, 95));
        studs.add(new Student(3, 45));
        studs.add(new Student(4, 35));
        studs.add(new Student(5, 85));
        
        for(Student s: studs){
            System.out.println(s);
        }
        
        System.out.println("After Sorting");
        
        
        
        Collections.sort(studs);
//        Collections.sort(studs, (s1, s2) -> {
//            return s1.marks > s2.marks ? -1 : s1.marks<s2.marks ? 1: 0;
//        });
//        
        
        
         for(Student s: studs){
            System.out.println(s);
        }
    }
    
    
    
}

// Comparable vs Comparator

