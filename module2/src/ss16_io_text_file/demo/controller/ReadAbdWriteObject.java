package ss16_io_text_file.demo.controller;

import ss16_io_text_file.demo.model.Student;
import sun.reflect.misc.FieldUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAbdWriteObject {
    public final static String FILE_NAME = "src/ss16_io_text_file/demo/data/object.csv";

    public static void main(String[] args) {
        Student student = new Student(1, "Công Bịp", "Module 1");
        Student student1 = new Student(2, "Công Công", "Module 2");
        Student student2 = new Student(3, "Công Chúa", "Module 3");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
//        for (Student students : studentList) {
//            writeOneStudent(students);
//        }
        writeListStudent(studentList);
    }

    public static void writeOneStudent(Student student) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.writeInfor());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void writeListStudent(List<Student> studentList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: studentList) {
                bufferedWriter.write(student.writeInfor());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



