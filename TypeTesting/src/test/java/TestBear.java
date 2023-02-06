import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBear {
//    @Before

    @Test
    public void bearHasAName(){
        Bear bear = new Bear("Baloo", 5, 95.62, 'M');
        assertEquals("Baloo", bear.getName());
    }
    @Test
    public void bearHasAnAge(){
        Bear bear = new Bear("Baloo", 5, 95.62, 'M');
        assertEquals(5, bear.getAge());
    }
    @Test
    public void bearHasAWeight(){
        Bear bear = new Bear("Baloo", 5, 95.62, 'M');
        assertEquals(95.62, bear.getWeight(), 0.0);
    }
    @Test
    public void bearIsReadyToHibernate(){
        Bear bear = new Bear("Baloo", 5, 95.62, 'M');
        assertEquals(true, bear.readyToHibernate());
    }
    @Test
    public void bearIsntReadyToHibernate(){
        Bear bear = new Bear("Arsus", 42, 71.24, 'M');
        assertEquals(false, bear.readyToHibernate());
    }
    @Test
    public void bearSex(){
        Bear bear = new Bear("Arsus", 42, 71.24, 'M');
        assertEquals('M', bear.getSex());
    }
}
