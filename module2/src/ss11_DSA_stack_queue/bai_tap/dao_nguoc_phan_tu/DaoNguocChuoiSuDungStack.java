package ss11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoiSuDungStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuổi vào đây: ");
        String[] mWord = sc.nextLine().split(" ");

        Stack<String> mStack = new Stack<>();
        for (String s : mWord) {
            mStack.push(s);
        }
        System.out.println(mStack);
        int size = mStack.size();
        String mWordreverse = "";
        for (int i = 0; i < size; i++) {
            mWordreverse += mStack.pop();
            mWordreverse += " ";
        }

        System.out.println(mWordreverse);
    }
}
