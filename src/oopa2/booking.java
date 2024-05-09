
package oopa2;

public class booking {
    // initialised variables
    private int bookingId;
    private String roomId;
    private String date;
    private String time;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    // constructors
    public booking(){}
    public booking(int bookingId, String roomId, String date, String time, String contactPerson, String contactEmail, String contactPhone){
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.date = date;
        this.time = time;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }
    // setters
    public void setBookingId(int bookingId){ this.bookingId = bookingId; }

    public void setRoomId(String roomId){ this.roomId = roomId; }

    public void setDate(String date){ this.date = date; }

    public void setTime(String time){ this.time = time; }

    public void setContactPerson(String person){ this.contactPerson = person; }

    public void setContactEmail(String email){ this.contactEmail = email;}

    public void setContactPhone(String phone){ this.contactPhone = phone; }
    // getters
    public int getBookingId(){ return this.bookingId; }

    public String getRoomId(){ return this.roomId; }

    public String getDate(){ return this.date; }

    public String getTime(){ return this.time; }

    public String getContactPerson(){ return this.contactPerson; }

    public String getContactEmail(){ return this.contactEmail; }

    public String getContactPhone() { return this.contactPhone; }
    
    
    // methods
    public boolean isBookingConflict(String roomId, String date, String time) {
        // Loop through the existing bookings
        for (booking booking : AppLib.bookingLst) {
            // Check if the roomId, date, and time match
            if (booking.getRoomId().equals(roomId) && booking.getDate().equals(date) && booking.getTime().equals(time)) {
                // If there is a match, return true indicating a conflict
                return true;
            }
        }
        // If no conflict is found, return false
        return false;
    }

}