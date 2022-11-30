package demo.mo_hinh_MVC.mo_hinh_MVC1.service.impl;

import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;
import demo.mo_hinh_MVC.mo_hinh_MVC1.service.IStudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService implements IStudentService {

    private static final String PATH_FILE = "src/demo/mo_hinh_MVC/mo_hinh_MVC1/repository/file_student.txt";
    private static StudentIOService studentIOService = new StudentIOService();

    @Override
    public void addStudent(Student student) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();

        if (studentIOService.readStudent(PATH_FILE) == null){
            students.add(student);
            studentIOService.writeStudent(PATH_FILE, students);
        }else {
            students =studentIOService.readStudent(PATH_FILE);
            students.add(student);
            studentIOService.writeStudent(PATH_FILE, students);
        }

    }

    @Override
    public List<Student> displayStudent() throws IOException, ClassNotFoundException {
        return studentIOService.readStudent(PATH_FILE);
    }

    @Override
    public Student searchStudent(String id) throws IOException, ClassNotFoundException {
        List<Student> students = studentIOService.readStudent(PATH_FILE);
        for (Student item : students) {
            if (Objects.equals(id, item.getId())) {
                return item;
            }
        }
        return null;
    }
}
