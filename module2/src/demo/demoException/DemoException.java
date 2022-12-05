package demo.demoException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoException {
    private static final String PATH_FILE = "src/demo/demoException/demo_exception.csv";
    public static void writeDemo(String pathFile, StudentDemo studentDemos){
        BufferedWriter bw=null;
        try {
            bw = new BufferedWriter(new FileWriter(pathFile));
            bw.write(studentDemos.toString());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<StudentDemo> readDemo(String pathFile){
        List<StudentDemo> studentDemoList = new ArrayList<>();
        StudentDemo studentDemo = null;
        BufferedReader br= null;
        String[] studentArray;

        try {
            br = new BufferedReader(new FileReader(pathFile));
            String list = "";
            while ((list = br.readLine()) != null){
                studentArray = list.split(",");
                studentDemo = new StudentDemo(studentArray);
                studentDemoList.add(studentDemo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return studentDemoList;
    }

    public static void main(String[] args) {
        List<StudentDemo> studentDemoList = new ArrayList<>();
        List<StudentDemo> studentDemoList1 = new ArrayList<>();
        readDemo(PATH_FILE);
        StudentDemo studentDemo1 = new StudentDemo("1" , "1");
        StudentDemo studentDemo2 = new StudentDemo("2" , "2");
        StudentDemo studentDemo3 = new StudentDemo("3" , "3");

        studentDemoList.add(studentDemo1);
        studentDemoList.add(studentDemo2);
        studentDemoList.add(studentDemo3);
        for (StudentDemo item : studentDemoList) {
            writeDemo(PATH_FILE,item);
        }

        studentDemoList1 = readDemo(PATH_FILE);
        for (StudentDemo item :
                studentDemoList1) {
            System.out.println(item);
        }
    }
}
