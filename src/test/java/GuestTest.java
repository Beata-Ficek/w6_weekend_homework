import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Dorota");
    }

    @Test
    public void hasName(){
        assertEquals("Dorota", guest1.getName());
    }


}
