package ss16_io_text_file.demo.tu_demo;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWrite {
    public static final String FILE_LINE = "src/ss16_io_text_file/data/file.csv";
    public static void main(String[] args) {
        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_LINE);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("C0222G1\n");
//            bufferedWriter.write("C0322G1\n");
//            bufferedWriter.write("C0422G1\n");
//            bufferedWriter.write("C0522G1\n");
//            bufferedWriter.write("C0622G1\n");
//            bufferedWriter.flush();
            fileWriter.write("C0422G1\n");
            fileWriter.write("C0522G1\n");
            fileWriter.write("C0622G1\n");
            fileWriter.write("C0722G1\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
//                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
