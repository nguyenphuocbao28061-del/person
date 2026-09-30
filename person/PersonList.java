/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PersonList {

    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
        System.out.println("Added successfully!");
    }

    public void updatePerson(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePerson(id);
            System.out.println("Updated successfully!");
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }

    public Person findPersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (Person p : personList) {
            System.out.println("-----------------------------------");
            p.displayInfo();
        }
    }
}
