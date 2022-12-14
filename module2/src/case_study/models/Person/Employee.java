package case_study.models.Person;

public class Employee extends Person {
    private String level;
    private String location;
    private String wage;

    public Employee() {
    }

    public Employee(String level, String location, String wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String[] array) {
        super(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4],array[5],array[6] );
        this.level = array[7];
        this.location = array[8];
        this.wage = array[9];
    }

    public Employee(int code, String name, String dateOfBirth, String sex, String idNumber, String phoneNumber,
                    String email, String level, String location, String wage) {
        super(code, name, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() + "," + level + "," + location + "," + wage;
    }
}
