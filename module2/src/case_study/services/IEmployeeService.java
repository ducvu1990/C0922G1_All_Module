package case_study.services;

import case_study.models.Person.Employee;
import com.sun.xml.internal.bind.v2.model.core.Element;

public interface IEmployeeService extends IService<Employee>{
    void addEmployee(Employee employee);
    void deleteEmployee(int code);
    void editEmployee(int code, Employee employee);
}
