package ss5_accessModifier_staticMethod_staticProperty.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Circle circle1 = new Circle(10.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
