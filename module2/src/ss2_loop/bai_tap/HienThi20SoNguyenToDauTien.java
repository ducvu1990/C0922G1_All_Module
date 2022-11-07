package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        boolean number;
        for (int i = 2;; i++) {
            number = true;
            if (count < 20){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        number = false;
                        break;
                    }
                }
                if (number){
                    count += 1;
                    System.out.println("Số thứ " + count + ": " + i);
                }
            }else {
                break;
            }

        }
    }
}
