package ss11_DSA_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi vào đây");
        int thapPhan = Integer.parseInt(sc.next());
        Stack<Integer> stack = new Stack<>();

        while (thapPhan != 0) {
            stack.push(thapPhan % 2);
            thapPhan = thapPhan / 2;
        }

        System.out.println(stack);

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
