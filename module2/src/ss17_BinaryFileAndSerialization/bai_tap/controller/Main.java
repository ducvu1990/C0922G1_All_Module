package ss17_BinaryFileAndSerialization.bai_tap.controller;

import ss17_BinaryFileAndSerialization.bai_tap.model.Product;
import ss17_BinaryFileAndSerialization.bai_tap.service.ProductManagement;

import java.util.Scanner;

public class Main {
    public static final String PATH_FILE = "src/ss17_BinaryFileAndSerialization/bai_tap/repository/product.txt";

    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("------MENU------\n" +
                    "1.\tThêm sản phẩm.\n" +
                    "2.\tHiển thị sản phẩm.\n" +
                    "3.\tTìm kiếm sản phẩn.\n" +
                    "4.\tthoát chọn.");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập 'mã sản phẩm': ");
                    String id = String.valueOf(sc.nextLine());
                    System.out.println("Nhập 'tên sản phẩm': ");
                    String name = String.valueOf(sc.nextLine());
                    System.out.println("Nhập 'hãng sản xuất': ");
                    String brand = String.valueOf(sc.nextLine());
                    System.out.println("Nhập 'giá': ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập 'mô tả khác': ");
                    String description = String.valueOf(sc.nextLine());
                    Product product = new Product(id, name, brand, price, description);
                    pm.addProduct(product, PATH_FILE);
                    break;
                case 2:
                    System.out.println(pm.displayProduct(PATH_FILE));
                    break;
                case 3:
                    System.out.println("Nhập id cần tìm kiếm.");
                    String idSearch = String.valueOf(sc.nextLine());
                    System.out.println(pm.searchProduct(idSearch, PATH_FILE));
                    break;
            }
        }while (option != 4);
    }
}
