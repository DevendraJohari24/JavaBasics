/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectserialization;

/**
 *
 * @author deven
 */
public class Student {
    private int rollno;
    private String sname;

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
}
