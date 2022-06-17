package SoloTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee5 {
    int id;
    String name,department;

    public Employee5(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

}

class SortbyId implements Comparator<Employee5> {
    @Override
    public int compare(Employee5 employee1, Employee5 employee2) {
        return employee1.id - employee2.id;
    }
}

class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Employee5> workers5 = new ArrayList<>();

        Employee5 employee15 = new Employee5(11, "Kim Coding", "Software Engineering");
        Employee5 employee25 = new Employee5(5, "Hello World", "Growth Marketing");
        Employee5 employee35 = new Employee5(7, "Park Hacker", "Software Engineering");

        workers5.add(employee15);
        workers5.add(employee25);
        workers5.add(employee35);

        for (Employee5 employee:workers5) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }

        Collections.sort(workers5, new SortbyId());

        for (Employee5 employee:workers5) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }
    }
}