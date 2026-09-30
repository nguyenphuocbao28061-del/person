/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public abstract class Person implements IPerson {
    private String id;
    private String fullName;
    private Date dateOfBirth;

    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextLine();

        System.out.print("Enter Full Name: ");
        this.fullName = sc.nextLine();

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            this.dateOfBirth = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Defaulting to current date.");
            this.dateOfBirth = new Date();
        }
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Full Name: ");
        this.fullName = sc.nextLine();

        System.out.print("Update Date of Birth (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            this.dateOfBirth = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Keeping existing date.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + (dateOfBirth != null ? dateFormat.format(dateOfBirth) : "N/A"));
    }
}

