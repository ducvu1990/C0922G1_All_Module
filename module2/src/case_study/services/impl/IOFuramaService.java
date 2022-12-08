package case_study.services.impl;

import case_study.services.IIOFuramaService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFuramaService<T> implements IIOFuramaService {

    @Override
    public void writeData(String pathFile, List t) {
        File file = new File(pathFile);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Object item : t) {
                bufferedWriter.write(item.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public List<String> readData(String pathFile) {
        List<String> arrayObject = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                arrayObject.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return arrayObject;
    }
}
