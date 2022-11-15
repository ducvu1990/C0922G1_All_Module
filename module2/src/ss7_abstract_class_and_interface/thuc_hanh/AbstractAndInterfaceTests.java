package ss7_abstract_class_and_interface.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Tiger tiger = new Tiger();
        System.out.println(tiger);
        for(Animal animal:animals){
            System.out.println(animal.makeSound());
        }
    }
}
