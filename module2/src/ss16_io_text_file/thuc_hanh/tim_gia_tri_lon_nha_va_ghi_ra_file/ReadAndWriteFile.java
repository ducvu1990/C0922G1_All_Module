package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nha_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number = new ArrayList<>();
        File file = null;
        BufferedReader br = null;
        try{
            file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại hoặc nôij dung có lỗi!");
        } catch (IOException e) {
            System.err.println("Lỗi nhập xuất");
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return number;
    }
    public void writeFile (String filePath, int max){
        BufferedWriter bufferedWriter = null;
        try{
            FileWriter writer = new FileWriter(filePath,true);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println("Giá trị không xác định hoặc lỗi file!");;
            }
        }
    }
}
