package ss10_DSA_list.bai_tap.thu_vien_linkidList;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
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

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Vu 1");
        Student student2 = new Student(2, "Vu 2");
        Student student3 = new Student(3, "Vu 3");
        Student student4 = new Student(4, "Vu 4");

        myLinkedList.addFirat(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(3,student4);
//        myLinkedList.remove(2);
//        myLinkedList.remove(student3);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getId()+"."+student.getName());
        }

        System.out.println("\n");
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getId()+"."+student.getName());
//        }
        System.out.println(myLinkedList.constrains(student3));
        System.out.println(myLinkedList.indexOf(student3));
    }
}
