package demo.mo_hinh_MVC.mo_hinh_MVC1.controller;

import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;
import demo.mo_hinh_MVC.mo_hinh_MVC1.service.impl.StudentService;

import java.io.IOException;
import java.util.List;
public class StudentController extends Student{
    private final StudentService studentService = new StudentService();

    public StudentController() {
    }

    public StudentController(String id, String name, String className) {
        Student student = new Student(id, name, className);
    }

    public void addStudent(Student student){
        try {
            this.studentService.addStudent(student);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> displayStudent(){
        try {
            return this.studentService.displayStudent();
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    public Student searchStudent(String id){

        try {
            return this.studentService.searchStudent(id);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }
}
