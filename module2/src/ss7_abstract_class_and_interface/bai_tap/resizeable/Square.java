package ss7_abstract_class_and_interface.bai_tap.resizeable;

import ss7_abstract_class_and_interface.bai_tap.colorable.IColorable;

public class Square extends Geometry implements IColorable {
    @Override
    public void resize(double percent) {
        setSize(getSize() + size * percent/100);
    }
    private double size = 1;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return size * size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
