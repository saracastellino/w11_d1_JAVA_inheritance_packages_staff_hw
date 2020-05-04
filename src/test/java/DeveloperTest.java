import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Matthew Wilcken", "AH3289Y", 3000.00);
    }

    @Test
    public void developerHasName() {
        assertEquals("Matthew Wilcken", developer.getName());
    }

    @Test
    public void developerHasNI() {
        assertEquals("AH3289Y", developer.getNI());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(3000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void developerRaiseSalary() {
        developer.raiseSalary(50.00);
        assertEquals(3050.00, developer.getSalary(), 0.1);
    }

    @Test
    public void developerPayBonus() {
        assertEquals(30.00, developer.payBonus(), 0.1);
    }
}

