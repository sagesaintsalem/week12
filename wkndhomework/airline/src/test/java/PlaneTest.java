import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.MAGICTINCAN);
    }

    @Test
    public void planeHasAModelName(){
        assertEquals(PlaneType.MAGICTINCAN, plane.getModel());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(1000, PlaneType.MAGICTINCAN.getCapacity());
    }
}
