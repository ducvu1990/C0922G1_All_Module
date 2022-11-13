package ss6_inheritance.thuc_hanh;

public class Square extends Rectangle{
    public Square() {
        super(1,1);
    }
    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
}
