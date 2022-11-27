package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_torng_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        File file = null;
        BufferedReader br = null;
        try {
            // Đọc file theo đường dẫn
            file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại.
            br = new BufferedReader(new FileReader(file));
            String line = "";
            int max = Integer.parseInt(br.readLine());
            System.out.println(max);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (max < Integer.parseInt(line)){
                    max = Integer.parseInt(line);
                }
            }

            // Hiễn thị ra màn hình tổng các số nguyên trong file
            System.out.println("Số lớn nhất là = " + max);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
