/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcbasics;

/**
 *
 * @author deven
 */
public class JDBCBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

/*
RDBMS
JAVA -> SQL Query
require connectivity to connect java application to Database


// 4 drivers used 

Steps of connectivity

1. import the package   -> java.sql
2. Load And Register The driver  -> 
    - Load The driver      -> depends on which kind of database you are working   -> com.mysql.jdbc.Driver -> download a jar file -> mysql.Connector
    - Register the driver  -> forName method -> load the driver  -> Class.forName("com.mysql.jdbc.Driver")
3. Connecting or Establish The connection -> interface -> Connection -> DriverManager is the class -> static method inside it -> getConnection method give you the object of Connection  -> parameter it takes -> URL, username, password
4. Create the statement  -> Statement is interface -> Statement st = con.createStatement();
    - Statement -> normal query
    - Prepared Statement -> predefined query with different value
    - Callable Statement -> for stored procedure
5. Execute the Query    -> ResultSet rs = st.executeQuery("QUERY"); -> ResultSet -> interface who stores that return table
6. Process result -> rs.next() -> shift the pointer to next row -> rs.getInt(1) + " " + rs.getString(2);
7. Close the Connection


DDL -> structure of the data
DML -> create delete manipulate the data
DQL -> executeQuery
TCL
*/
