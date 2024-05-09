
package oopa2;

public class labRoom extends room {
    // initialised variables
    private int numberOfPcs;
    private String operatingSystem;
    // constructors
    public labRoom(){}
    public labRoom(String roomId, int roomNumber, int floor, int capacity, int numberOfPcs, String operatingSystem){
        super(roomId, roomNumber, floor, capacity);
        this.numberOfPcs = numberOfPcs;
        this.operatingSystem = operatingSystem;
    }
    // setters
    public void setNumberOfPcs(int numOfPcs){this.numberOfPcs = numOfPcs;}

    public void setOperatingSystem(String operatingSystem){this.operatingSystem = operatingSystem;}
    // getters
    public int getNumberOfPcs(){return this.numberOfPcs;}

    public String getOperatingSystems(){return this.operatingSystem;}
}

