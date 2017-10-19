/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class classDbcon {
    
     static String us = "root";
   static String pass = "145";
   static String bd = "nutrition";
    static String url = "jdbc:mysql://192.168.6.13/"+bd;
    
    public Connection con = null;
    public classDbcon(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, us, pass);
        
            if(con!=null){
                System.out.println("En linea");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConnect(){
        return con;
    }
    
    public void desconnect(){
        con = null;
    }
    
    public static void main(String[] args) {
        classDbcon c = new classDbcon();
        c.getConnect();
    }

    
}
