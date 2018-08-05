import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private boolean chargeable;
    private int dailyRate;

    public ConferenceRoom (int capacity, ArrayList<Guest> guests, int price, boolean chargeable, int dailyRate){
        super(capacity, guests);
        this.chargeable = chargeable;
        this.dailyRate = dailyRate;
    }

    public boolean getChargeable(){
        return this.chargeable;
    }

    public void setChargeable(){
        this.chargeable = chargeable;
    }

    public int getDailyRate(){
        return this.dailyRate;
    }

    public void setDailyRate(){
        this.dailyRate = dailyRate;
    }


}
