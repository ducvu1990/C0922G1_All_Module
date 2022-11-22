package ss12_java_collection_framework.bai_tap;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double gia;

    public Product() {
        this.id = 1;
        this.name = "iphone";
        this.gia = 1000.0;
    }

    public Product(int id, String name, double gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
