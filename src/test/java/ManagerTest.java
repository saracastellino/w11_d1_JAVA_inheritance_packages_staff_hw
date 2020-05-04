import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John Wayne", "DKJ3984", 10000.00, "Tech");
    }

    @Test
    public void managerHasName() {
        assertEquals("John Wayne", manager.getName());
    }

    @Test
    public void managerHasNI() {
        assertEquals("DKJ3984", manager.getNI());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(10000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void managerHasDept() {
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void managerRaiseSalary() {
        manager.raiseSalary(50.00);
        assertEquals(10050.00, manager.getSalary(), 0.1);
    }

    @Test
    public void managerPayBonus() {
        assertEquals(100.00, manager.payBonus(), 0.1);
    }
}
