/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectserialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author deven
 */
public class SerializeXML {
    public static void main(String[] args) throws Exception{
        Student st1 = new Student();
        st1.setRollno(101);
        st1.setSname("Devendra");
        
        Student st2 = new Student();
        st2.setRollno(102);
        st2.setSname("Kushagra");
        
        List<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);
        
        College c = new College();
        c.setStudents(s);
        
        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        x.writeObject(c);
        x.close();
    }
}
