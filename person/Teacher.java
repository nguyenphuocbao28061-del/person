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
public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
        super();
    }

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        this.department = sc.nextLine();

        System.out.print("Enter Teaching Subject: ");
        this.teachingSubject = sc.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        super.updatePerson(id);
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Department: ");
        this.department = sc.nextLine();

        System.out.print("Update Teaching Subject: ");
        this.teachingSubject = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Teacher");
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
