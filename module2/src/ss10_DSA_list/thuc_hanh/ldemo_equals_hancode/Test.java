package ss10_DSA_list.thuc_hanh.ldemo_equals_hancode;

import ss10_DSA_list.bai_tap.thu_vien_arrayList.TestMyArrayList;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Ha", "Ha Noi");
        Student student2 = new Student("Quang", "Quang Binh");
        Student student3 = new Student("Quang", "Quang Binh");
        System.out.println(student2.equals(student3));
    }
}
