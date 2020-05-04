import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Laura Romeo", "UH98742", 4000.00);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Laura Romeo", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNI() {
        assertEquals("UH98742", databaseAdmin.getNI());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(4000.00, databaseAdmin.getSalary(), 0.1);
    }
    
    @Test
    public void databaseRaiseSalary() {
        databaseAdmin.raiseSalary(50.00);
        assertEquals(4050.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void databasePayBonus() {
        assertEquals(40.00, databaseAdmin.payBonus(), 0.1);
    }
}
