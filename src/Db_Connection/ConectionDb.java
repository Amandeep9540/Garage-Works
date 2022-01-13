
package Db_Connection;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConectionDb {
   public static Connection con ;
   public static   Statement st;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection(  "jdbc:mysql://localhost:3306/garageWorks","root","mukulrampal");
	       
	 st = con.createStatement();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
        }
}
