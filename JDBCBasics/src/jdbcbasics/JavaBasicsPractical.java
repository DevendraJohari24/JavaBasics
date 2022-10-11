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
public class JavaBasicsPractical {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "root";
        String query = "select userName from student where userId=3";
        
        Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.jdbc.Driver is deprecated
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        // because by default pointer will be before first row
        rs.next();
        String name = rs.getString("userName");
        System.out.println(name);
        st.close();
        con.close();
    }
}
