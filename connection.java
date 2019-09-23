/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRollSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author albertzkiki
 */
public class connection {
    Connection conn = null;
    public  Connection Connectdb (){
     try{
                String dbnam = "bd_payrollsystem";
                String pass = "kiki";
                String url = "jdbc:mysql://localhost:3306/";
                String driver = "com.mysql.jdbc.Driver";
                String usernam = "root";
               
                Class.forName(driver);
                conn = DriverManager.getConnection(url+dbnam,usernam,pass);
                
                return conn;
                }
        catch(ClassNotFoundException | SQLException e ){
        JOptionPane.showMessageDialog(null, e.getMessage());
        return null;
        }
    }
    
}
