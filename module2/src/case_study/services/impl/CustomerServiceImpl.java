package case_study.services.impl;

import case_study.models.Person.Customer;
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
                    item.setName(customer.getName());
                    item.setDateOfBirth(customer.getDateOfBirth());
                    item.setSex(customer.getSex());
                    item.setIdNumber(customer.getIdNumber());
                    item.setPhoneNumber(customer.getPhoneNumber());
                    item.setEmail(customer.getEmail());
                    item.setTypeOfGuest(customer.getTypeOfGuest());
                    item.setAddress(customer.getAddress());
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
