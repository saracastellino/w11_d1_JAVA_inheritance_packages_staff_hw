import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Billie Elliot", "AH93874", 3000.00);
    }

    @Test
    public void employeeHasName() {
        assertEquals("Billie Elliot", employee.getName());
    }

    @Test
    public void employeeHasNI() {
        assertEquals("AH93874", employee.getNI());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(3000.00, employee.getSalary(),0.1);
    }

    @Test
    public void employeeRaiseSalary() {
        employee.raiseSalary(50.00);
        assertEquals(3050.00, employee.getSalary(), 0.1);
    }

    @Test
    public void employeepayBonus() {
        assertEquals(30.00, employee.payBonus(), 0.1);
    }
}
