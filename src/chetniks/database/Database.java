/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chetniks.database;

import chetniks.domain.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Database {
    private Connection connection;
   
    public Database() {
       
        String url="";
        String user="root";
        String passw="";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakse", user, passw);
           
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
       
       
    }
   
    public List<Student> getStudents(){
        List<Student> students= new ArrayList<>();
        String url="";
        String user="root";
        String passw="";
        try {
            String query="SELECT * FROM student ORDER BY Ime";
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(query);
           
            while(rs.next()){
                String ime = rs.getString("Ime");
                String prezime = rs.getString("Prezime");
                Student student=new Student(ime, prezime);
                students.add(student);
            }
           
           
           
            rs.close();
            st.close();
           
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
    
    
    public static void main(String[] args) {
        Database db = new Database();
        List<Student> students = db.getStudents();
        for (int i = 0; i < 2; i++) {
            System.out.println(students.get(i).Ime);
        }
        
    }
}
