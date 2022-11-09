package ss5_class_and_obiect.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the c: ");
        double c = sc.nextDouble();
        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
        if (phuongTrinhBacHai.getDiscriminant() > 0){
            System.out.println("QuadraticEquation two root 1:" + phuongTrinhBacHai.getRoot1());
            System.out.println("QuadraticEquation two root 2:" + phuongTrinhBacHai.getRoot2());
        }else if (phuongTrinhBacHai.getDiscriminant() == 0){
            System.out.println("QuadraticEquation one root:" + phuongTrinhBacHai.getRoot1());
        }else {
            System.out.println("QuadraticEquation no root");
        }
    }
}
