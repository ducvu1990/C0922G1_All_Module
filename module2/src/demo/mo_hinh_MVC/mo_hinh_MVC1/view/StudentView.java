package demo.mo_hinh_MVC.mo_hinh_MVC1.view;

import demo.mo_hinh_MVC.mo_hinh_MVC1.controller.StudentController;
import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController studentController = new StudentController();
    public static void main(String[] args) {
        do{
            System.out.println("");
            System.out.println("-----MENU-----");
            System.out.println("1. Display students");
            System.out.println("2. Add student");
            System.out.println("3. Delete student");
            System.out.println("4. Edit student");
            System.out.println("5. Exit");

            System.out.println("Enter your option");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (option) {
                case 1:
                    List<Student> students = studentController.displayStudent();
                    if (students == null) break;
                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;
                case 2:
                    System.out.println("Input ID");
                    String id = scanner.nextLine();

                    System.out.println("Input name");
                    String name = scanner.nextLine();

                    System.out.println("Input class name");
                    String className = scanner.nextLine();
                    Student student = new Student(id,name, className);
                    studentController.addStudent(student);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Invalid option");
            }
        }while (true);
    }
}
