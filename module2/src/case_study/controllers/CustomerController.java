package case_study.controllers;

import case_study.models.Person.Customer;
import case_study.services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final CustomerServiceImpl customerService = new CustomerServiceImpl();

    public List<Customer> displays() {
        return customerService.displays();
    }

    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }

    public void editCustomer(int code, Customer customer) {
        customerService.editCustomer(code, customer);
    }

    public boolean checkIdCustomer(int code) {
        return customerService.checkIdCustomer(code);
    }
}
