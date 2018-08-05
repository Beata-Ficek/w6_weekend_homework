import java.util.ArrayList;

public abstract class Room {

     int capacity;
     ArrayList<Guest> guests;

     public Room (int capacity, ArrayList <Guest> guests){
         this.capacity = capacity;
         this.guests = new ArrayList<Guest>();

     }

     public int getCapacity() {
         return this.capacity;
     }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }


     public ArrayList getGuestList(){
         return this.guests;
     }


}
