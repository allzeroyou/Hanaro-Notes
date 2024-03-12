package company;

public class Employee {
    // private: 캡슐화
    private int id;
    private String idc;
    private String name;
    private long sal; // 더 큰 정수형

    private static int num = 100;

    // default constructor
    public Employee() {
        System.out.println("Default Constructor...");
    }

    public Employee(int id) {
        this(id, "", "");
        this.sal = 10000L;
    }

    // 인자 추가s
    public Employee(int id, String idc, String name) {
        this(id, idc, name, 10000L);
    }

    public Employee(int id, String idc, String name, long sal) {
        this.id = num++; // 생성자가 호출될때 마다 하나씩 증가(class 소유)
        this.idc = idc;
        this.name = name;
        if (sal <= 0) {
            // 예외 발생시킴.
        }
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
        return sal * 12;
    }
}
