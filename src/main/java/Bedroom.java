import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private BedroomType type;
    private int nightlyRate;
    private boolean chargeable;


    public Bedroom (int capacity, ArrayList<Guest> guests, int number, BedroomType type, int nightlyRate, boolean chargeable) {

        super(capacity, guests);
        this.number = number;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.chargeable = chargeable;

    }


    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public BedroomType getType(){
        return this.type;
    }

    public void setType(BedroomType type){
        this.type = type;
    }

    public int getNightlyRate(){
        return this.nightlyRate;
    }

    public void setNightlyRate(int nightlyRate){
        this.nightlyRate = nightlyRate;
    }

    public boolean getChargeable() {
        return this.chargeable;
    }

}