package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class TestCircleRectangleSquare {
    public static void main(String[] args) {
      Geometry[] geometries = new Geometry[3];
      geometries[0] = new Circle(5);
      geometries[1] = new Rectangle(3,4);
      geometries[2] = new Square(2);
      int size = geometries.length;
        for (int i = 0; i < size; i++) {
            System.out.println(geometries[i].getArea());
        }
        geometries[0].resize(50);
        geometries[1].resize(60);
        geometries[2].resize(100);
        for (int i = 0; i < size; i++) {
            System.out.println(geometries[i].getArea());
        }
    }
}
