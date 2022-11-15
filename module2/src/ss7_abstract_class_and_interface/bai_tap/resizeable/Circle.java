package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Circle extends Geometry {
    @Override
    public void resize(double percent) {
        setRadius(getRadius() + radius * percent/100);
    }
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
