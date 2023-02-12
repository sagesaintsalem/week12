import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Fergus MacDonald", "FM123456D", 32000);
    }
    @Test
    public void hasName(){
        assertEquals("Fergus MacDonald", developer.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("FM123456D", developer.getNiNumber());
    }

    @Test
    public void isGettinPaid(){
        assertEquals(32000, developer.getSalary(), 0.0);
    }

    @Test
    public void canHasRaise(){
        developer.raiseSalary(1.57);
        assertEquals(50240, developer.getSalary(), 0.0);
    }

    @Test
    public void canHasBonus(){
        assertEquals(320.00, developer.payBonus(developer.getSalary()), 0.0);
    }
}
