/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList list = new PersonList();
        int choice;

        do {
            System.out.println("\n========== PERSON MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- ADD NEW STUDENT ---");
                    Student student = new Student();
                    student.addPerson();
                    list.addPerson(student);
                    break;
                case 2:
                    System.out.println("\n--- ADD NEW TEACHER ---");
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    list.addPerson(teacher);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    list.updatePerson(updateId);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    list.deletePersonById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String findId = sc.nextLine();
                    Person foundPerson = list.findPersonById(findId);
                    if (foundPerson != null) {
                        System.out.println("\n--- FOUND PERSON ---");
                        foundPerson.displayInfo();
                    } else {
                        System.out.println("Person with ID " + findId + " not found.");
                    }
                    break;
                case 6:
                    System.out.println("\n--- ALL STUDENTS AND TEACHERS ---");
                    list.displayEveryone();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        } while (choice != 0);

        sc.close();
    }
}
