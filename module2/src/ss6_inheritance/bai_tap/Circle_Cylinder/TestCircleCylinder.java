package ss6_inheritance.bai_tap.Circle_Cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(5, "red");
        System.out.println(circle1);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(5, "black", 4);
        System.out.println(cylinder1);
    }
}
