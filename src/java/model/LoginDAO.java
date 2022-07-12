package model;
import java.sql.*;
public class LoginDAO extends MyDAO {

    public User checkLogin(String user, String pass) {
      xSql = "select * from Login where username = ? and password = ?";

      String xRole;
      User x = null;
      try {
        ps = con.prepareStatement(xSql);
        ps.setString(1, user);
        ps.setString(2, pass);
        rs = ps.executeQuery();
        
      if(rs.next()) { 
        xRole = rs.getString("role");
        x = new User(user,pass,xRole);
       }
       else
         x = null; 
       rs.close();
       ps.close();
      }
       catch(Exception e) {
      }
     return(x); 
   } 
    public User checkExist(String user) {
      xSql = "select * from Login where username = ?";
      String xRole;
      String xPass;
      User x = null;
      try {
        ps = con.prepareStatement(xSql);
        ps.setString(1, user);        
        rs = ps.executeQuery();
        
      if(rs.next()) { 
        xRole = rs.getString("role");
        xPass = rs.getString("password");
        x = new User(user,xPass,xRole);
       }
       else
         x = null; 
       rs.close();
       ps.close();
      }
       catch(Exception e) {
      }
     return(x); 
   }
    
    public void signup(String user,String pass){
        xSql ="insert into Login values(?,?,'guest')";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user); 
            ps.setString(2, pass); 
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
