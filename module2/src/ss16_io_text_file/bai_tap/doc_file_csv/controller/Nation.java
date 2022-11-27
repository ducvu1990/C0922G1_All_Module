package ss16_io_text_file.bai_tap.doc_file_csv.controller;

public class Nation {
    int id;
    String code, name;

    public Nation() {
        this.id = 0;
        this.code = "VN";
        this.name = "Viet Nam";
    }

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getId() + "," + this.getCode() + "," + this.getName();
    }
}
