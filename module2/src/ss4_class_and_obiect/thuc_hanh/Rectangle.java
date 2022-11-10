package ss4_class_and_obiect.thuc_hanh;

public class Rectangle {
    double width, heigh;

    public Rectangle(){
    }

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public double getArea(){
        return this.width * this.heigh;
    }

    public double getPerimeter(){
        return (this.width + this.heigh) * 2;
    }

    public String display(){
        return "Rectangle{" + "Width=" + width + ", height=" +heigh + "}";
    }
}
