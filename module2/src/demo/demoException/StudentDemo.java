package demo.demoException;

public class StudentDemo {
    private String id, name;

    public StudentDemo(String[] studentdemo) {
        this.id = studentdemo[0];
        this.name = studentdemo[1];
    }

    public StudentDemo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + "," + this.name;
    }
}
