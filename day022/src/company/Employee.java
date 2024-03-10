package company;

public class Employee {
    // private: 캡슐화
    private int id;
    private String idc;
    private String name;
    private long sal; // 더 큰 정수형

    public Employee(int id, String idc, String name, long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal; // this.sal
    }
    public long getAnnSalary() {
        return sal*12;
    }
}
