package case_study.services.impl;

import case_study.models.Person.Employee;
import case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final List<Employee> employeeServiceList = new ArrayList<>();

    @Override
    public List<Employee> displays() {
        return employeeServiceList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeServiceList.add(employee);
    }

    @Override
    public void deleteEmployee(int code) {
        if (employeeServiceList == null) {
            return;
        } else {
            for (Employee item : employeeServiceList) {
                if (code == item.getCode()) {
                    employeeServiceList.remove(item);
                    return;
                }
            }
        }
    }

    @Override
    public void editEmployee(int code, Employee employee) {
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
                    return;
                }
            }
        }
    }

    public boolean checkIdEmployee(int code) {
        for (Employee item : employeeServiceList) {
            if (code == item.getCode()) {
                return true;
            }
        }
        return false;
    }

}
