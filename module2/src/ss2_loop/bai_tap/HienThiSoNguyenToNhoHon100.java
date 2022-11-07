package ss2_loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.print("Số nguyên tố nhỏ hơn 100 là: ");
        boolean number;
        for (int i = 2; i < 100; i++) {
            number = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    number = false;
                    break;
                }
            }
            if (number) {
                System.out.print(i + ", ");
            }

        }
    }
}
