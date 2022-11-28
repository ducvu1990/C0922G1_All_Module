package ss17_BinaryFileAndSerialization.bai_tap.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String id, name, brand;
    private double price;
    private String description;

    public Product() {
        this.id = "000";
        this.name = "Oppo A0";
        this.brand = "Oppo";
        this.price = 1000;
        this.description = "camera dep";
    }

    public Product(String id, String name, String brand, double price, String description) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }
    public Product(String[] array){
        this.id = array[0];
        this.name = array[1];
        this.brand = array[2];
        this.price = Double.parseDouble(array[4]);
        this.description = array[3];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
