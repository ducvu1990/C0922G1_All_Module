package case_study.models.facility;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
public Room(String[] array){
        super(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),Integer.parseInt(array[4]),array[5] );
        this.freeServiceIncluded = array[6];
}
    public Room(String serviceCode, String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople,
                String rentalType, String freeServiceIncluded) {
        super(serviceCode,serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.toString()+"," + freeServiceIncluded;
    }
}
