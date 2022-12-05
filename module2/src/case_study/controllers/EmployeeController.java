package case_study.controllers;

import case_study.models.Person.Employee;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public List<Employee> displays() {
        return employeeService.displays();
    }
    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }
    public void deleteEmployee(int code) {
        employeeService.deleteEmployee(code);
    }
    public void editEmployee(int code, Employee employee) {
       employeeService.editEmployee(code,employee);
    }
    public boolean checkIdEmployee(int code) {
        return employeeService.checkIdEmployee(code);
    }
}
