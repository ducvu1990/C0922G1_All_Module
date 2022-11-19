package ss11_DSA_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_phan_tu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHienTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cai gi vao day");
        String[] string = sc.nextLine().split(" ");
        Map<String, Integer> treeMap = new TreeMap<>();

        int size = string.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (string[i].equals(string[j])) {
                    count++;
                }
            }
            if (string[i].equals("")) {

            } else {
                treeMap.put(string[i], count);
            }
            count = 0;
        }
        System.out.println(treeMap);

    }
}
