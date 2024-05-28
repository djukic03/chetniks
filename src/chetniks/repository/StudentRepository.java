/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.repository;

import chetniks.domain.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class StudentRepository {
    
    private Connection connection;
   
    public StudentRepository() {
       
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
   
    
    public List<Student> getAllStudents(){
        List<Student> students= new ArrayList<>();
        
        try {
            String query="SELECT * FROM student ORDER BY BrojIndeksa";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            while(rs.next()){
                int index = rs.getInt("BrojIndeksa");
                String firstName = rs.getString("Ime");
                String lastName = rs.getString("Prezime");
                String studentEmail = rs.getString("StudentskiEmail");
                String privateEmail = rs.getString("PrivatniEmail");
                String telephoneNumber = rs.getString("BrojTelefona");
                Student student = new Student(index, firstName, lastName, studentEmail, privateEmail, telephoneNumber, null, null);  //dodati za smer i nivo studija kada to resimo u bazi
                students.add(student);
            }
           
//            rs.close();       nisam siguran da li ovo treba
            st.close();
            closeConn();
           
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        return students;
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
