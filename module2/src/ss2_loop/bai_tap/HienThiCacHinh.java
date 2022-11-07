package ss2_loop.bai_tap;

public class HienThiCacHinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
