package demo.mo_hinh_MVC.mo_hinh_MVC1.service;

import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    void writeStudent(String pathFile, List<Student> studentList) throws IOException;
    List<Student> readStudent(String pathFile) throws IOException, ClassNotFoundException;
}
