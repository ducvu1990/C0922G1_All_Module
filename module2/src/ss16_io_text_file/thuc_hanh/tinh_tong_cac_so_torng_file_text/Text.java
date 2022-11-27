package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_torng_file_text;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = sc.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
