package demo.mo_hinh_MVC.mo_hinh_MVC1.service.impl;

import demo.mo_hinh_MVC.mo_hinh_MVC1.model.Student;
import demo.mo_hinh_MVC.mo_hinh_MVC1.service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOService implements IStudentIOService {
    @Override
    public void writeStudent(String pathFile, List<Student> studentList) throws IOException {
        File file =new File(pathFile);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public List<Student> readStudent(String pathFile) throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        studentList = (List<Student>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return studentList;
    }
}
