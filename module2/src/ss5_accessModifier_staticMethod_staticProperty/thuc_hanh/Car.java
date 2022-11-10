package ss5_accessModifier_staticMethod_staticProperty.thuc_hanh;

public class Car {
    private String name, engine;

    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazd3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
