package case_study.services.impl;

import case_study.models.Person.Employee;
import case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IOFuramaService ioFuramaService = new IOFuramaService();
    private final String PATH_FILE = "src/case_study/data/empioyee.csv";

    @Override
    public List<Employee> displays() {
        List<Employee> employeeServiceList = new ArrayList<>();
        List<String> arrayDisplay = ioFuramaService.readData(PATH_FILE);
        if (arrayDisplay == null) {
            return null;
        } else {
            for (int i = 0; i < arrayDisplay.size(); i++) {
                String[] aaaaa = arrayDisplay.get(i).split(",");
                employeeServiceList.add(new Employee(aaaaa));
            }
        }
        return employeeServiceList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<Employee> employeeServiceList = new ArrayList<>();
        if (ioFuramaService.readData(PATH_FILE) == null) {
            employeeServiceList.add(employee);
            ioFuramaService.writeData(PATH_FILE, employeeServiceList);
        } else {
            List<String> arrayAdd = ioFuramaService.readData(PATH_FILE);
            for (String item : arrayAdd) {
                Employee employee1 = new Employee(item.split(","));
                employeeServiceList.add(employee1);
            }
            ioFuramaService.writeData(PATH_FILE, employeeServiceList);
        }


    }

    @Override
    public void deleteEmployee(int code) {
        List<Employee> employeeServiceList = new ArrayList<>();
        List<String> arrayReadFromFile= ioFuramaService.readData(PATH_FILE);
        for (String item :arrayReadFromFile) {
            String[] arraysUsedToCreateObjects = item.split(",");
            employeeServiceList.add(new Employee(arraysUsedToCreateObjects));
        }
        if (employeeServiceList == null) {
            System.err.println("empty file");;
        } else {
            for (Employee item : employeeServiceList) {
                if (code == item.getCode()) {
                    employeeServiceList.remove(item);
                    ioFuramaService.writeData(PATH_FILE,employeeServiceList);
                    return;
                }
            }
        }
    }

    @Override
    public void editEmployee(int code, Employee employee) {
        List<Employee> employeeServiceList = new ArrayList<>();
        List<String> arrayReadFromFile= ioFuramaService.readData(PATH_FILE);
        for (String item :arrayReadFromFile) {
            String[] arraysUsedToCreateObjects = item.split(",");
            employeeServiceList.add(new Employee(arraysUsedToCreateObjects));
        }
        if (employeeServiceList == null) {
            return;
        } else {
            for (Employee item : employeeServiceList) {
                if (code == item.getCode()) {
                    item.setName(employee.getName());
                    item.setDateOfBirth(employee.getDateOfBirth());
                    item.setSex(employee.getSex());
                    item.setIdNumber(employee.getIdNumber());
                    item.setPhoneNumber(employee.getPhoneNumber());
                    item.setEmail(employee.getEmail());
                    item.setLevel(employee.getLevel());
                    item.setLocation(employee.getLocation());
                    item.setWage(employee.getWage());
                    ioFuramaService.writeData(PATH_FILE,employeeServiceList);
                    return;
                }
            }
        }
    }

    public boolean checkIdEmployee(int code) {
        List<Employee> employeeServiceList = new ArrayList<>();
        List<String> arrayReadFromFile= ioFuramaService.readData(PATH_FILE);
        for (String item :arrayReadFromFile) {
            String[] arraysUsedToCreateObjects = item.split(",");
            employeeServiceList.add(new Employee(arraysUsedToCreateObjects));
        }
        for (Employee item : employeeServiceList) {
            if (code == item.getCode()) {
                return true;
            }
        }
        return false;
    }

}
