package p03_Mankind;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;


    public Worker(String firstName, String lastName,
                  double weekSalary, double workHoursPerDay) {

        super(firstName, lastName);
        setWorkHoursPerDay(workHoursPerDay);
        setWeekSalary(weekSalary);
    }

    public double moneyPerHour() {
        return (this.weekSalary / 7) / this.workHoursPerDay;
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }

        super.lastName = lastName;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }

        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }

        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nFirst Name: %s%nWeek Salary: %.2f%n" +
                        "Hours per day: %.2f%nSalary per hour: %.2f%n",
                super.getFirstName(), super.getLastName(), this.weekSalary,
                this.workHoursPerDay, this.moneyPerHour());
    }
}
