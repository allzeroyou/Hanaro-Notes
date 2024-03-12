package oop.app;

import oop.company.Employee;
import oop.company.SalesEmployee;
import oop.company.SecretaryEmployee;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("100", "james", "Account", 1000);
        System.out.println(e1);

        // 상위 클래스로 다형성 가능..
        Object obj = new Employee("100", "james", "Accout", 1000);
        System.out.println(obj);
        //
        Employee e2 = new SalesEmployee("100", "james", "Account", 1000, 500);
        System.out.println(e2);

        Employee emps[] = new Employee[3];
        emps[0] = new Employee("100", "james", "Account", 1000);
        emps[1] = new SecretaryEmployee("100", "james", "Account", 1000, "boss");
        emps[2] = new SalesEmployee("100", "james", "Account", 1000, 5);

        for (Employee e : emps) {
            System.out.println(e.getAnnSalary());
        }

    }
}
