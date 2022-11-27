package ss16_io_text_file.bai_tap.doc_file_csv.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFileCsv {
    public static final String PATH_FILE = "" +
            "src/ss16_io_text_file/bai_tap/doc_file_csv/data/nation.csv";
    public static void readFile(String pathFile){
        Nation nation;
        String[] lineSplit;
        int id;
        String code;
        String name;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(pathFile);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                lineSplit = line.split(",");
                id = Integer.parseInt(lineSplit[0]);
                code = lineSplit[1];
                name = lineSplit[2];
                nation = new Nation(id, code, name);
                System.out.println(nation.toString());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại hoặc dữ liệu bị lỗi!");
        } catch (IOException e) {
            System.err.println("Lỗi không độc đc file");
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                System.err.println("lỗi không đóng được file!");;
            }

        }
    }

    public static void main(String[] args) {
        readFile(PATH_FILE);
    }
}
