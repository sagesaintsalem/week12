import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Max Power", CrewRank.CAPTAIN, "MP098765");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Max Power", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CrewRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicense(){
        assertEquals("MP098765", pilot.getLicense());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("it fly", pilot.fly());
    }
}
