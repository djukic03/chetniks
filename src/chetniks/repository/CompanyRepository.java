/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.repository;

import chetniks.domain.Company;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CompanyRepository {
    private Connection connection;
   
    public CompanyRepository() {
       
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
   
    
    public List<Company> getAllCompanies(){
        List<Company> companies= new ArrayList<>();
        
        try {
            String query="SELECT * FROM kompanija";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            while(rs.next()){
                int PIB = rs.getInt("PIB");
                String name = rs.getString("Naziv");
                String phoneNumber = rs.getString("BrojTelefona");
                String webSite = rs.getString("WebAdresa");
                String address = rs.getString("Adresa");
                Company company = new Company(PIB, name, phoneNumber, webSite, address);
                companies.add(company);
            }
           
//            rs.close();       nisam siguran da li ovo treba
            st.close();
            closeConn();
           
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        return companies;
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
