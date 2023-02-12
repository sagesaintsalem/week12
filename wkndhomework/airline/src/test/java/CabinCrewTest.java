import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before (){
        cabinCrewMember = new CabinCrewMember("Jane Plane", CrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void crewHasName(){
        assertEquals("Jane Plane", cabinCrewMember.getName());
    }

    @Test
    public void crewHasRank(){
        assertEquals(CrewRank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void crewCanSpeak(){
        assertEquals("Quack", cabinCrewMember.speak());
    }
}
