package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập độ dài cạnh A");
                double canhA = Double.parseDouble(sc.nextLine());
                checkTriangleCanh(canhA);

                System.out.println("Nhập độ dài cạnh B");
                double canhB = Double.parseDouble(sc.nextLine());
                checkTriangleCanh(canhB);

                System.out.println("Nhập độ dài cạnh C");
                double canhC = Double.parseDouble(sc.nextLine());
                checkTriangleCanh(canhC);
                checkTriangle(canhA, canhB, canhC);
                System.out.println(canhA + ", " + canhB + ", " + canhC + ", là ba cạnh của tam giác.");
                break;

            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }while (true);
    }
    public static void checkTriangle (double canhA, double canhB, double canhC) throws IllegalTriangleException{
        if ((canhA + canhB) <= canhC || (canhA + canhC) <= canhB || (canhB + canhC) <= canhA){
           throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại của tam giác!");
        }
    }

    public static void checkTriangleCanh (double canh) throws IllegalTriangleException{
        if (canh <= 0){
            throw new IllegalTriangleException("Cạnh tam giác phải là một số, và số đó phải là số dương!");
        }
    }
}
