package demo.mo_hinh_MVC.mo_hinh_MVC1.service;

import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student) throws IOException, ClassNotFoundException;

    List<Student> displayStudent() throws IOException, ClassNotFoundException;

    Student searchStudent(String id) throws IOException, ClassNotFoundException;


}
