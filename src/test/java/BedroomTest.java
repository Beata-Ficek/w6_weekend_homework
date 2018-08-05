import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom VIP;


    @Before
    public void before() {
        VIP = new Bedroom(4,, BedroomType.QUAD, 600, true);
    }


    @Test
    public void roomHasNumber(){
        assertEquals(164, VIP.getNumber());
    }

    @Test
    public void canChangeNumber(){
        VIP.setNumber(18);
        assertEquals(18, VIP.getNumber());
    }

    @Test
    public void roomHasBedroomType(){
        assertEquals(BedroomType.QUAD, VIP.getType());
    }

    @Test
    public void canChangeType(){
        VIP.setType(BedroomType.SINGLE);
        assertEquals(BedroomType.SINGLE, VIP.getType());
    }

    @Test
    public void roomHasSpace(){
        assertEquals(4, VIP.getType().getCapacity());
    }

    @Test
    public void roomHasNightlyRate(){
        assertEquals(600, VIP.getNightlyRate());
    }

    @Test
    public void canChangeNightlyRate(){
        VIP.setNightlyRate(650);
        assertEquals(650, VIP.getNightlyRate());
    }

    @Test
    public void getChargeable(){
        assertEquals(true, VIP.getChargeable());
    }


}



