/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author deven
 */
public class FetchDataAllRowsDemo {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "root";
        String query = "select * from student";
        
        Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.jdbc.Driver is deprecated
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        // because by default pointer will be before first row
        String rowData = "";
        while(rs.next()){
            rowData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(rowData);

        }
        st.close();
        con.close();
    }
}
