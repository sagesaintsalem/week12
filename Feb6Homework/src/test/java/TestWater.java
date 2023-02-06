import org.feb6homework.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWater {

    private WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle();

    }

    @Test
    public void hasWater(){
        assertEquals(100, waterBottle.getVol());
    }

    @Test
    public void drank(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyDatBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillDatBottle(){
        assertEquals(100, waterBottle.fill());
    }
}
