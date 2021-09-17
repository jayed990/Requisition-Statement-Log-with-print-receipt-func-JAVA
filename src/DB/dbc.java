package DB;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class dbc 
{
        final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        
 //local 
        /*
    final static String DB_URL = "jdbc:mysql://localhost:3306/forms";
    final static String USER = "root";
    final static String PASS = "";
    //server: 172.18.152.24//test: 172.18.152.100//oggy: 192.168.1.55
*/
//web
        
    final static String DB_URL = "jdbc:mysql://192.168.1.55:3306/forms";
    final static String USER = "dba";
    final static String PASS = "1234";

    
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