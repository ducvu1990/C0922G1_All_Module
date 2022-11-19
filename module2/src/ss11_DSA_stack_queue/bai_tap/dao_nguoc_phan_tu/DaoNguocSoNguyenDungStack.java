package ss11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocSoNguyenDungStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phẩn tử thứ [" + i + "]");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < size; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
