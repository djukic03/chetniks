/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks;

import chetniks.domain.Company;
import chetniks.domain.Student;
import chetniks.repository.CompanyRepository;
import chetniks.repository.StudentRepository;
import java.util.List;

/**
 *
 * @author user
 */
public class Chetniks {
    
    public static void main(String[] args) {
        StudentRepository sr = new StudentRepository();
        List<Student> students = sr.getAllStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).firstName + " " + students.get(i).lastName);
        }
        
        
        CompanyRepository cr = new CompanyRepository();
        List<Company> companies = cr.getAllCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).PIB + " " + companies.get(i).name);
        }
        
        sr.closeConn();
        cr.closeConn();
    }
}
