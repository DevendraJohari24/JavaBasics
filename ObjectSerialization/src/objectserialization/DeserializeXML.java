/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectserialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.List;

/**
 *
 * @author deven
 */
public class DeserializeXML {
    public static void main(String [] args) throws Exception{
        XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
        College c = (College) x.readObject();
        List<Student> s = c.getStudents();
        for(Student value: s){
            System.out.println(value);
        }
    }
}
