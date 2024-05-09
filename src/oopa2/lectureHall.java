
package oopa2;

public class lectureHall extends room {
    // initialised variables
    private String microphoneType;
    private boolean tieredSeating;
    
    // constructors
    public lectureHall(){}
    public lectureHall(String roomId, int roomNumber, int floor, int capacity, String microphoneType, boolean tieredSeating){
        super(roomId, roomNumber, floor, capacity);
        this.microphoneType = microphoneType;
        this.tieredSeating = tieredSeating;
    }
    // setters
    public void setMicrophoneType(String microphoneType){this.microphoneType = microphoneType;}

    public void setTieredSeating(boolean tieredSeating){this.tieredSeating = tieredSeating;}
    
    // getters
    public String getMicrophoneType(){return this.microphoneType;}

    public boolean getTieredSeating(){return this.tieredSeating;}
}
