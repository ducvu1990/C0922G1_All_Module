package ss12_java_collection_framework.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        Product product1 = new Product(10,"aa",1000);
        Product product2 = new Product(20,"bb",2000);
        Product product3 = new Product(30,"cc",3000);
        Product product4 = new Product(40,"dd",4000);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product1);
        productManager.add(product4);


        int luaChon = 0;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1.\tThêm sản phẩm\n" +
                    "2.\tSửa thông tin sản phẩm theo id\n" +
                    "3.\tXoá sản phẩm theo id\n" +
                    "4.\tHiển thị danh sách sản phẩm\n" +
                    "5.\tTìm kiếm sản phẩm theo tên\n" +
                    "6.\tSắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "0.\tthoát khỏi chưng trình");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    System.out.println("nhap id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten");
                    String name = String.valueOf(sc.nextLine());
                    System.out.println("nhap gia");
                    double gia = Double.parseDouble(sc.nextLine());
                    Product product = new Product(id,name,gia);
                    productManager.add(product);
                    break;
                case 2:
                    System.out.println("nhap id can sua");
                    int idSua = Integer.parseInt(sc.nextLine());
                    System.out.println(productManager.edit(idSua));
                    break;
                case 3:
                    System.out.println("nhap id can xoa");
                    int idXoa = Integer.parseInt(sc.nextLine());
                    System.out.println(productManager.deletes(idXoa));
                    break;
                case 4:
                    System.out.println(productManager.Diplay());
                    break;
                case 5:
                    System.out.println("nhap ten can tim");
                    String names = String.valueOf(sc.nextLine());
                    System.out.println(productManager.search(names));
                    break;
                case 6:
                    System.out.println(productManager.sorts());
                    break;
            }

        }while (luaChon != 0);
    }
}
