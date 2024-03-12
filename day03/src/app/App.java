package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee(0, "100", "james1", 20000L);
        Employee emp2 = new Employee(0, "101", "james2", 20000L);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
