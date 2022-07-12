
package model;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DAO extends MyDAO{
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6)));
            }
        } catch (Exception e) {
        }
            
        return list;
    }
    public Product getProduct(String txt) {
        String query = "select * from product where id = ?";
        List<Product> list = new ArrayList<>();
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Product> getProductByCID(String cid){
        List<Product> list = new ArrayList<>();
        String query = "select * from Product LEFT JOIN Category ON Product.type = Category.type where cid = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6)));
            }
        } catch (Exception e) {
        }
            
        return list;
    }
    
    public Product getProductByID(String id){
        
        String query = "select * from Product LEFT JOIN Category ON Product.type = Category.type where id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Product> searchByName(String txtSearch){
        List<Product> list = new ArrayList<>();
        String query = "select * from Product where [name] like ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, "%"+txtSearch+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6)));
            }
        } catch (Exception e) {
        }
            
        return list;
    }
    public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), 
                                    rs.getString(2)));
            }
        } catch (Exception e) {
        }
            
        return list;
    }
    
    public Product getLast(){
        String query = "select top 1 * from Product\n" + "order by id desc";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), 
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getInt(6));
            }
        } catch (Exception e) {
        }
            
        return null;
    }
    
    public void delete(String pid){
        String query="delete from product where id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();            
        } catch (Exception e) {
        }
        
    }
    public void insert(String id,String name,String image,String price,String description,String type){
        String query = "INSERT [dbo].[product] ([id],[name],[img],[description],[type],[price]) VALUES (?,?,?,?,?,?)";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, image);
            ps.setString(6, price);
            ps.setString(4, description);
            ps.setString(5, type);
            ps.executeUpdate();            
        } catch (Exception e) {
        }
    }
    
    public void edit(String id,String name,String image,String price,String description,String type){
        String query = "update product set [name] = ?,[img] = ?,[description] =?,[type] =?,[price] = ? where [id] = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(6, id);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(5, price);
            ps.setString(3, description);
            ps.setString(4, type);
            ps.executeUpdate();            
        } catch (Exception e) {
        }
    }
    
}
