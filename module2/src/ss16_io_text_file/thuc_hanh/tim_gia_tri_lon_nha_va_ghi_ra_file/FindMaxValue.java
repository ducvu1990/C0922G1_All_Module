package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nha_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max <number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile(
                "src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nha_va_ghi_ra_file/number.txt");
        int maxValue = findMax(number);
        readAndWriteFile.writeFile("src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nha_va_ghi_ra_file/result.txt", maxValue);

    }
}
