package Staff;

public class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        salary = salary + raise;
    }

    public double payBonus() {
        return salary / 100 * 1;
    }
}
