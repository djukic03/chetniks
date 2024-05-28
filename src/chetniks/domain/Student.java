/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.domain;

/**
 *
 * @author user
 */
public class Student {
    public int index;
    public String firstName;
    public String lastName;
    public String studentEmail;
    public String privateEmail;
    public String telephoneNumber;
    public String major;
    public String studiesLevel;

    public Student(int index, String firstName, String lastName, String studentEmail, String privateEmail, String telephoneNumber, String major, String studiesLevel) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentEmail = studentEmail;
        this.privateEmail = privateEmail;
        this.telephoneNumber = telephoneNumber;
        this.major = major;
        this.studiesLevel = studiesLevel;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudiesLevel() {
        return studiesLevel;
    }

    public void setStudiesLevel(String studiesLevel) {
        this.studiesLevel = studiesLevel;
    }
    
    
}
