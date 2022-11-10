package ss4_class_and_obiect.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Reatangle \n" + rectangle.display());
        System.out.println("Perimeter of the Reactangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Reatangle: " + rectangle.getArea());
    }
}
