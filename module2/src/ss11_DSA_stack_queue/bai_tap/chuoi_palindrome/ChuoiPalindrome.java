package ss11_DSA_stack_queue.bai_tap.chuoi_palindrome;

import java.util.*;

public class ChuoiPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Viết gì vào đây: ");
        String[] strings = String.valueOf(sc.nextLine()).split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        int size = strings.length;
        for (int i = 0; i < size; i++) {
            stack.push(strings[i]);
            queue.add(strings[i]);
        }

        boolean test = true;
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(stack.pop(), queue.poll())){
                test = false;
                break;
            }
        }
        if (test){
            System.out.println("chuỗi là Palindrome");
        }else {
            System.out.println("chuỗi không phải là Palindrome");
        }
    }
}
