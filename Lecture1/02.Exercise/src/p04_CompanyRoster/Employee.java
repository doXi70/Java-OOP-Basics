package p04_CompanyRoster;

public class Employee implements Comparable<Employee> {
    private static final String EMAIL_DEFAULT_VALUE = "n/a";
    private static final int AGE_DEFAULT_VALUE = -1;

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    // ONLY MANDATORY
    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = AGE_DEFAULT_VALUE;
        this.email = EMAIL_DEFAULT_VALUE;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary, this.salary);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",
                this.name, this.salary, this.email, this.age);
    }
}
