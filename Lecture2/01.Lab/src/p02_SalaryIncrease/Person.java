package p02_SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }


    public double getSalary() {
        return this.salary;
    }


    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus /= 2;
            this.salary = ((this.salary * bonus) / 100) + this.salary;
        } else {
            this.salary = ((this.salary * bonus) / 100) + this.salary;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(), this.getLastName(), this.getSalary());
    }
}
