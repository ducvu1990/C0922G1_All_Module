package ss10_DSA_list.bai_tap.thu_vien_arrayList;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vũ 1");
        Student b = new Student(2, "Vũ 2");
        Student c = new Student(3, "Vũ 3");
        Student d = new Student(4, "Vũ 4");
        Student e = new Student(5, "Vũ 5");
        Student f = new Student(6, "Vũ 6");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 3);
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student students = (Student) studentMyArrayList.elements[i];
//            System.out.println(students.getId());
//            System.out.println(students.getName());
//        }
//        System.out.println(studentMyArrayList.get(2).getName());
        newMyArrayList = studentMyArrayList.clone();
//        newMyArrayList.remove(2);
        newMyArrayList.clear();
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
