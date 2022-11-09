package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        boolean booleans;
        while (count < 20) {
            booleans = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    booleans = false;
                    break;
                }
            }
            if (booleans) {
                count += 1;
                System.out.println("Số thứ " + count + ": " + i);
            }
            i++;
        }
    }
}
