package ss6_inheritance.bai_tap.point2D_point3D;

import java.util.Arrays;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point3D);
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        point3D.setX(7);
        point3D.setY(8);
        point3D.setZ(9);
        System.out.println(point3D);
        point3D.setXYZ(3, 5, 7);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
