
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Fergus MacDonald", "FM123456D", 32000);
    }

    @Test
    public void hasName(){
        assertEquals("Fergus MacDonald", databaseAdmin.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("FM123456D", databaseAdmin.getNiNumber());
    }

    @Test
    public void isGettinPaid(){
        assertEquals(32000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canHasRaise(){
        databaseAdmin.raiseSalary(1.57);
        assertEquals(50240, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canHasBonus(){
        assertEquals(320.00, databaseAdmin.payBonus(databaseAdmin.getSalary()), 0.0);
    }
}

