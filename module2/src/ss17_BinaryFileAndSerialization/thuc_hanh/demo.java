package ss17_BinaryFileAndSerialization.thuc_hanh;

import ss17_BinaryFileAndSerialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static List<Product> list = new ArrayList<>();

    public static void writeProduct(String pathFile, List<Product> products) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Product> readProduct(String pathFile) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(pathFile);
            ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static final String PATH_FILE = "src/ss17_BinaryFileAndSerialization/bai_tap/repository/product.txt";

    public static void deleteProduct(String pathFile){
        List<Product> products = readProduct(pathFile);
        products.clear();
        writeProduct(pathFile, products);
    }

    public static void main(String[] args) {
       deleteProduct(PATH_FILE);
    }
}