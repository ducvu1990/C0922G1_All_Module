package ss5_class_and_obiect.bai_tap.mo_ta_cai_quat;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan();
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
