import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayed
 */
public class dbcon 
{
        final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        
 //local   
    final static String DB_URL = "jdbc:mysql://localhost:3306/forms";
    final static String USER = "root";
    final static String PASS = "";

//web
    /*
    final static String DB_URL = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6431775";
    final static String USER = "sql6431775";
    final static String PASS = "EDiQgulrBD";
*/
    
public static Connection connection()
{
try
{
Class.forName(JDBC_DRIVER);

Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

return conn;
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
    return null;
}

}
}