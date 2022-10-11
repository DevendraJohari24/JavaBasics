/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcbasics;

/**
 *
 * @author deven
 */
import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.connect();
        Student s1 = dao.getStudent(8);
        System.out.println(s1.sname);
        Student s2 = new Student();
        s2.rollno = 15;
        s2.sname = "Archna";
        
        dao.connect();
        dao.addStudent(s2);
        
        System.out.println(dao.getStudent(15).sname);
        dao.removeStudent(1);
    }
}

class StudentDAO
{
    Connection con = null;
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aliens", "root", "root");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public Student getStudent(int rollno){
        
        try{
            String query = "select userName from student where userId=" + rollno;
            Student s = new Student();
            s.rollno = rollno;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString("userName");
            s.sname = name;
            return s;
        }   
        catch(Exception e){
            System.out.println(e);   
        }
        return null;
    }
    
    public void addStudent(Student s){
        String query = "insert into student values (?, ?)";
        PreparedStatement st ;
        try{
            st = con.prepareStatement(query);
            st.setInt(1, s.rollno);
            st.setString(2, s.sname);
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void removeStudent(int rollno){
        String query = "delete from student where userId=?";
        PreparedStatement st;
        try{
            st = con.prepareStatement(query);
            st.setInt(1, rollno);
            st.executeUpdate();
            System.out.println("Deleted Successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class Student{
    int rollno;
    String sname;
}