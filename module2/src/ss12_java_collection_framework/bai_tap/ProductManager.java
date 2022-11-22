package ss12_java_collection_framework.bai_tap;

import java.util.*;

public class ProductManager {
    private ArrayList<Product> arrayList;

    public ProductManager() {
        this.arrayList = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Product product){
        this.arrayList.add(product);
    }
    public String edit(int id){
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).getId() == id){
                Scanner scanner = new Scanner(System.in);
                System.out.println("edit id");
                int ids = Integer.parseInt(scanner.nextLine());
                arrayList.get(i).setId(ids);
                System.out.println("edit name");
                String name = String.valueOf(scanner.nextLine());
                arrayList.get(i).setName(name);
                System.out.println("edit gia");
                double gia = Double.parseDouble(scanner.nextLine());
                arrayList.get(i).setGia(gia);
                return "da sua";
            }
        }
        return "id khong hop le";
    }
    public String deletes(int id){
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).getId() == id){
                arrayList.remove(i);
                return "da xoa";
            }
        }

        return "id khong hop le";
    }

    public ArrayList<Product> Diplay() {
        return arrayList;
    }
    public String search(String name){
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Objects.equals(name, arrayList.get(i).getName())){
               return arrayList.get(i).toString();
            }
        }
        return "Error name : " + name;
    }
    public ArrayList<Product> sorts(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getGia()<o2.getGia()){
                    return -1;
                }else if (o1.getGia()>o2.getGia()){
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

}
