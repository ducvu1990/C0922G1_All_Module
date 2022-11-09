package ss2_loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.print("Số nguyên tố nhỏ hơn 100 là: ");
        boolean booleans;
        for (int i = 2; i < 100; i++) {
            booleans = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    booleans = false;
                    break;
                }
            }
            if (booleans) {
                System.out.print(i + ", ");
            }
        }
    }
}
