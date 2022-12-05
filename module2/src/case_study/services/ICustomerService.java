package case_study.services;

import case_study.models.Person.Customer;

public interface ICustomerService extends IService{
    void addCustomer(Customer customer);
    void editCustomer(int code, Customer customer);
}
