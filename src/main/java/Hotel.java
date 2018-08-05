import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList <ConferenceRoom> conferenceRooms;
    private ArrayList <Bedroom> bedrooms;
    private ArrayList <Guest> guests;
    private ArrayList <Booking> bookings;
//    private Hashmap<Bedroom, ArrayList<Guest>> roomBookedby;



    public Hotel(String name, ArrayList <ConferenceRoom> conferenceRooms,
                 ArrayList <Bedroom> bedrooms, ArrayList <Guest> guests, ArrayList <Booking> bookings) {
        this.name = name;
        this.conferenceRooms = conferenceRooms;
        this.bedrooms = bedrooms;
        this.bookings = new ArrayList<>();
        this.guests = new ArrayList<>();
//        this.roomBookedby = new HashMap<Bedroom, ArrayList<Guest>>();
    }



        public ArrayList<Guest> getGuests() {
            return this.guests;
        }

        public ArrayList<Bedroom> getBedrooms() {
            return this.bedrooms;
        }



    public String GuestCheckIn(Guest guest){
        for (Booking booking: bookings) {
            if (booking.hasGuest(guest)){
                return "Guest checked in / room now booked";
            }

        }
    }

    public String GuestCheckOut(Guest guest){
        for (Booking booking: bookings){
            if (booking.hasGuest(guest))
                booking.removeGuest(guest);
            {
                return "Guest checked out";
            }
        }
    }



}
