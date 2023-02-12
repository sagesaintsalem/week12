import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesManager {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Angus Dundee", "AD1234567A", 45000, "Human Resources");
    }

    @Test
    public void hasADept(){
        assertEquals("Human Resources", manager.getDeptName());
    }
    @Test
    public void hasAName(){
        assertEquals("Angus Dundee", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AD1234567A", manager.getNiNumber());
    }

    @Test
    public void isGettinPaid(){
        assertEquals(45000, manager.getSalary(),0.0);
    }

    @Test
    public void canHasRaise(){
        manager.raiseSalary(1.57);
        assertEquals(70650, manager.getSalary(), 0.0);
    }

    @Test
    public void canHasBonus(){
        assertEquals(450.00, manager.payBonus(manager.getSalary()), 0.0);
    }
}
