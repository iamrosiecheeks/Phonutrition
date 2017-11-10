/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrition;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class classDbcon {
    
   // public static String DATABASE_URL = "jdbc:mysql://192.168.20.12/emyat";
     public static String DATABASE_URL = "jdbc:mysql://localhost/nutrition";
    //it13_setbabe is the name of the database
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static java.sql.Connection conn = null;
 
    
   // static String userName = "emyat";
    static String userName = "root";
   // static String password = "12345";
    static String password = "";
    static String url = DATABASE_URL;
    
 public static void dbconnect() {

        try {

            Class.forName(JDBC_DRIVER).newInstance();
            if (conn == null) {
                conn = (java.sql.Connection) DriverManager.getConnection(url, userName, password);
                System.out.println("Database connected...");
           
            } else if (conn.isClosed()) {
                conn = (java.sql.Connection) DriverManager.getConnection(url, userName, password);
            }
        } catch (Exception x) {
            System.err.println("Cannot Connect to Database...");
             System.err.println(x);
        }

    }
}
