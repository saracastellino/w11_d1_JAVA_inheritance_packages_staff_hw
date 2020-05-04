import Staff.Employee;
import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Anthony Dickinson", "GH98798", 12000.00, 200000.00);
    }

    @Test
    public void directorHasName() {
        assertEquals("Anthony Dickinson", director.getName());
    }

    @Test
    public void directorHasNI() {
        assertEquals("GH98798", director.getNI());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(12000.00, director.getSalary(), 0.1);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(200000.00, director.getBudget(), 0.1);
    }

    @Test
    public void directorRaiseSalary() {
        director.raiseSalary(50.00);
        assertEquals(12050.00, director.getSalary(), 0.1);
    }

    @Test
    public void directorPayBonus() {
        assertEquals(120.00, director.payBonus(), 0.1);
    }
}


