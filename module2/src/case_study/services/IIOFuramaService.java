package case_study.services;

import java.util.List;

public interface IIOFuramaService<T> {
    void writeData(String pathFile, List<T> t);
    List<String> readData(String pathFile);
}
