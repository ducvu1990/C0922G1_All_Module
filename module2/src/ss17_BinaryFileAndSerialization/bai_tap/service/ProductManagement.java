package ss17_BinaryFileAndSerialization.bai_tap.service;

import ss17_BinaryFileAndSerialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManagement {
    public static List<Product> list = new ArrayList<>();

    public void writeProduct(String pathFile, List<Product> products) {
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

    public List<Product> readProduct(String pathFile) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(pathFile);
            ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public String addProduct(Product product, String pathFile) {
        List<Product> prd = displayProduct(pathFile);
        if (prd == null) {
            list.add(product);
            writeProduct(pathFile, list);
            return "Đã thêm.";
        }else {
            for (Product item : prd) {
                if (Objects.equals(product.getId(), item.getId())) {
                    return "Id trùng, không thể thêm.";
                }
            }
        }
        list.add(product);
        writeProduct(pathFile, list);
        return "Đã thêm.";
    }


    public List<Product> displayProduct(String pathFile) {
        List<Product> productList = readProduct(pathFile);
        return productList;
    }

    public String searchProduct(String id, String pathFile) {
        String list = "";
        List<Product> products = displayProduct(pathFile);
        int size = products.size();
        for (int i = 0; i < size; i++) {
            if (Objects.equals(id, products.get(i).getId())) {
                list = products.get(i).toString();
                return list;
            }
        }
        return "ID không tồn tại.";
    }
}
