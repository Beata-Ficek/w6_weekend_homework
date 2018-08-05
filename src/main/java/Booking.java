import java.util.ArrayList;
import java.util.HashMap;

public class Booking {

    private ArrayList<Guest> guests;
    private ArrayList<Bedroom> bedrooms;


    public Booking() {
        this.guests = new ArrayList<>();
        this.bedrooms = new ArrayList<>();

    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }


    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public boolean hasGuest(Guest guest) {
        this.guests.contains(guest);
    }





}


