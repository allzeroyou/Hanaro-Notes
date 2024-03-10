package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(100, "id01", "james", 20000);

        // sal
        long sal = emp.getSal();
        long annsal = emp.getAnnSalary();

        System.out.println(emp); // emp.toString()이 생략됨


    }
}
