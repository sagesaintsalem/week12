import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before(){
        director = new Director("Saarlak the Bloody", "SB0000001K",666666, "Human Resources", 123456.00);
    }

    @Test
    public void hasABudget(){
        assertEquals(123456.00, director.getBudget(), 0.0);
    }
}
