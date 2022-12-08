package case_study.services.impl;

import case_study.models.Person.Customer;
import case_study.models.Person.Employee;
import case_study.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CustomerServiceImpl implements ICustomerService {
    private final String PATH_FILE = "src/case_study/data/cudtomer.csv";
    private final IOFuramaService ioFuramaService = new IOFuramaService();


    @Override
    public List<Customer> displays() {
        List<Customer> customerList = new LinkedList<>();
        List<String> arrayList = ioFuramaService.readData(PATH_FILE);
        for (String item :arrayList) {
            String[] arraysUsedToCreateObjects = item.split(",");
            customerList.add(new Customer(arraysUsedToCreateObjects));
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<Customer> customerList = new LinkedList<>();
        List<String> arrayList = ioFuramaService.readData(PATH_FILE);
        if (arrayList == null){
            customerList.add(customer);
            ioFuramaService.writeData(PATH_FILE,customerList);
        }else {
            for (String item :arrayList) {
                String[] arraysUsedToCreateObjects = item.split(",");
                customerList.add(new Customer(arraysUsedToCreateObjects));
            }
            customerList.add(customer);
            ioFuramaService.writeData(PATH_FILE,customerList);
        }

    }

    @Override
    public void editCustomer(int code, Customer customer) {
        List<Customer> customerList = new LinkedList<>();
        List<String> arrayList = ioFuramaService.readData(PATH_FILE);
        for (String item :arrayList) {
            String[] arraysUsedToCreateObjects = item.split(",");
            customerList.add(new Customer(arraysUsedToCreateObjects));
        }
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
                    ioFuramaService.writeData(PATH_FILE,customerList);
                    return;
                }
            }
        }
    }

    public boolean checkIdCustomer(int code) {
        List<Customer> customerList = new LinkedList<>();
        List<String> arrayList = ioFuramaService.readData(PATH_FILE);
        for (String item :arrayList) {
            String[] arraysUsedToCreateObjects = item.split(",");
            customerList.add(new Customer(arraysUsedToCreateObjects));
        }
        ListIterator<Customer> customerListIterator = customerList.listIterator();
        for (Customer item :customerList) {
            if (code == item.getCode()){
                return true;
            }
        }
        return false;
    }

}
