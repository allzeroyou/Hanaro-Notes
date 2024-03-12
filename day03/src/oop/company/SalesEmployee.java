package oop.company;

public class SalesEmployee extends Employee {
    private long bonus;

    // 기본 생성자
    public SalesEmployee() {
    }

    public SalesEmployee(String id, String name, String dept, long salary, long bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + this.bonus;
    }

    @Override
    public long getAnnSalary() {
        return super.getAnnSalary() + this.bonus;
    }
    // 연봉 계산시 세금 공제하기.
}
