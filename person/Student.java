/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
        super();
    }

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        this.gpa = Float.parseFloat(sc.nextLine());

        System.out.print("Enter Major: ");
        this.major = sc.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        super.updatePerson(id);
        Scanner sc = new Scanner(System.in);
        System.out.print("Update GPA: ");
        this.gpa = Float.parseFloat(sc.nextLine());

        System.out.print("Update Major: ");
        this.major = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Student");
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}
