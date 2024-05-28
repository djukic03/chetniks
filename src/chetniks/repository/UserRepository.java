/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.repository;

import chetniks.domain.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class UserRepository {
    private Connection connection;
   
    public UserRepository() {
       
        String url="";
        String user="root";
        String passw="";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakse", user, passw);
            System.out.println("Povezano sa bazom");
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
    }
   
    
    public List<User> getAllStudents(){
        List<User> users= new ArrayList<>();
        
        try {
            String query="SELECT * FROM korisnik";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            while(rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("Email");
                User user = new User(username, password, email);
                users.add(user);
            }
           
//            rs.close();       nisam siguran da li ovo treba
            st.close();
            
           
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        return users;
    }
    
    public void closeConn(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
