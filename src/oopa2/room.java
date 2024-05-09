package oopa2;

public class room {

    // initialised variables
    private String roomId;
    private int roomNumber;
    private int floor;
    private int capacity;

    // constructors
    public room() {
    }

    public room(String roomId, int roomNumber, int floor, int capacity) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
    }

    // setters
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // getters
    public String getRoomId() {
        return this.roomId;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getCapacity() {
        return this.capacity;
    }
    // methods

    public boolean isValidRoom(String roomId) {
        // Search for the room in labRoomLst
        boolean isValid = false;
        for (labRoom lab : AppLib.labRoomLst) {
            if (lab.getRoomId().equals(roomId)) {
                isValid = true;
            }
        }
         // search for the room ID in lectureHallLst
        for (lectureHall lecture : AppLib.lectureHallLst) {
            if (lecture.getRoomId().equals(roomId)) {
                isValid = true;
            } 
        }
        return isValid;
    }
    
    
}
