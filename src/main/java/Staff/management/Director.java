package Staff.management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String NI, double salary, double budget) {
        super(name, NI, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
