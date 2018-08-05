import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom Main;

    @Before
    public void before(){
        Main = new ConferenceRoom( 20, 40, true, 360);
    }

    @Test
    public void IsChargeable(){
        assertEquals(true, Main.getChargeable());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(360, Main.getDailyRate());
    }
}
