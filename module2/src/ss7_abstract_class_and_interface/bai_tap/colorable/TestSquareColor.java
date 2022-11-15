package ss7_abstract_class_and_interface.bai_tap.colorable;

import ss7_abstract_class_and_interface.bai_tap.resizeable.Circle;
import ss7_abstract_class_and_interface.bai_tap.resizeable.Geometry;
import ss7_abstract_class_and_interface.bai_tap.resizeable.Rectangle;
import ss7_abstract_class_and_interface.bai_tap.resizeable.Square;

import java.lang.management.GarbageCollectorMXBean;

public class TestSquareColor {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Square(3);
        geometries[1] = new Circle(20);
        geometries[2] = new Rectangle(12, 15);
        for (Geometry geometry : geometries) {
            System.out.println(geometry.getArea());
            if (geometry instanceof Square) {
                System.out.println(((Square) geometry).howToColor());
            }

        }
    }
}
