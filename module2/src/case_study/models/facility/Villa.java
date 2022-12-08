package case_study.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String[] array){
        super(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),Integer.parseInt(array[4]),array[5] );
        this.roomStandard = array[6];
        this.poolArea = Double.parseDouble(array[7]);
        this.numberOfFloors =Integer.parseInt(array[8]);
    }
    public Villa(String serviceCode,String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople,
                 String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode,serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "," + roomStandard + "," + poolArea + "," + numberOfFloors;
    }
}
