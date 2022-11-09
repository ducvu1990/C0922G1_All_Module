package ss5_class_and_obiect.demo;

public class SimpleCircle {
    double radius;

    SimpleCircle(){
        radius = 1;
    }

    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius*radius;
    }
}
