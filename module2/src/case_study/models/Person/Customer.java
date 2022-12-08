package case_study.models.Person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }
public Customer(String[] array){
        super(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4],array[5],array[6] );
        this.typeOfGuest = array[7];
        this.address = array[8];
}
    public Customer(int code, String name, String dateOfBirth, String sex, String idNumber, String phoneNumber,
                    String email, String typeOfGuest, String address) {
        super(code, name, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "," + typeOfGuest + "," + address;
    }
}
