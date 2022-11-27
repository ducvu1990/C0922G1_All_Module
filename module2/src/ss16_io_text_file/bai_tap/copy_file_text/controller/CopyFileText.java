package ss16_io_text_file.bai_tap.copy_file_text.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static final String SOURCE_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/data/source";
    public static final String TARGET_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/data/target";
    public static void writerFile(String filePath, String data){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
            fileWriter.write(data + "\n");
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc dữ liệu bị lỗi!");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Lỗi đóng dữ liệu!");
            }
        }
    }

    public static List<String> readerFile(String filePath){
        List<String> arrayList = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File đọc không tồn tại hoặc dữ liệu bị lỗi! ");
        } catch (IOException e) {
            System.err.println("Lỗi bộ nhớ đệm!");
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.err.println("Lỗi đóng bộ nhớ đệm!");
            }
        }
        return arrayList;
    }
    public static boolean checkElementInFile(String data) {
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(TARGET_FILE);
            br =  new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File đích không tồn tại hoặc dư liệu bị lỗi!");
        } catch (IOException e) {
            System.err.println("Lỗi bộ nhớ đệm!");
        }finally {
            try {
                br.close();
                fileReader.close();
            } catch (IOException e) {
                System.err.println("Lỗi đóng file!");
            }
        }
        for (String item: list) {
            if (data != null && data.equals(item)){
                return true;
            }
        }
        return false;
    }
    public static void copyFile(String SOURCE_FILE, String TARGET_FILE) {
        List<String> array = new ArrayList<>();
        array = readerFile(SOURCE_FILE);
        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (checkElementInFile(array.get(i)) && array.get(i) != null){
                System.err.println("Data " + '"' + array.get(i) + '"' +" đã tồn tại!");
            }else {
                writerFile(TARGET_FILE, array.get(i));
            }
        }
    }

    public static void main(String[] args) {
        writerFile(SOURCE_FILE, "Duc Vu");
        writerFile(SOURCE_FILE, "Ngoc Hau");
        writerFile(SOURCE_FILE, "Ngoc Vu");
        writerFile(SOURCE_FILE, "van Hung");
        writerFile(SOURCE_FILE, "Duc Vu");
        copyFile(SOURCE_FILE,TARGET_FILE);
    }
}
