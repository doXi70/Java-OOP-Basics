package p03_ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }

        this.lastName = lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
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
