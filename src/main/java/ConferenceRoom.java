public class ConferenceRoom extends Room {

    private boolean chargeable;
    private int dailyRate;

    public ConferenceRoom (String name, int price, boolean chargeable, int dailyRate){
        super(name, price);
        this.name = name;
        this.price = price;
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
