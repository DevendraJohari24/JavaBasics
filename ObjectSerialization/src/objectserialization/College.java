/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectserialization;

import java.util.List;

/**
 *
 * @author deven
 */
public class College {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
    
    

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "College{" + "students=" + students + '}';
    }
    
    
    
}
