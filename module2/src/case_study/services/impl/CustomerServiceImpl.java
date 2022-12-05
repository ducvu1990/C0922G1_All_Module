package case_study.services.impl;

import case_study.models.Person.Customer;
import case_study.models.Person.Employee;
import case_study.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CustomerServiceImpl implements ICustomerService {
    private final List<Customer> customerList = new LinkedList<>();

    @Override
    public List<Customer> displays() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void editCustomer(int code, Customer customer) {
        if (customerList == null) {
            return;
        } else {
            for (Customer item : customerList) {
                if (code == item.getCode()) {
                    customerList.remove(item);
                    customerList.add(customer);
                    return;
                }
            }
        }
    }

    public boolean checkIdCustomer(int code) {
        ListIterator<Customer> customerListIterator = customerList.listIterator();
        for (Customer item :customerList) {
            if (code == item.getCode()){
                return true;
            }
        }
        return false;
    }

}
