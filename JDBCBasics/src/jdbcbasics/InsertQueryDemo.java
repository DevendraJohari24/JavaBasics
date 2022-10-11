/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcbasics;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author deven
 */
public class InsertQueryDemo {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "root";
        int userId = 8;
        String userName = "Rahul";
//        String query = "insert into student values(7, 'Neha')";
        // We use Prepared Statement when the values are changing
        String query = "insert into student values(?, ?)";
        Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.jdbc.Driver is deprecated
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, userId);
        st.setString(2, userName);
        
        int count =  st.executeUpdate(); // don't put query here in case of insert
        // DDL, DML, DQL, TCL
        System.out.println(count + "row/s affected");
        st.close();
        con.close();
    }
}


// DAO -> Data Access Object
