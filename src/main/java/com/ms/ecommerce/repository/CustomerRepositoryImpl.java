package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.service.CustomerService;

import java.util.ArrayList;

public class CustomerRepositoryImpl implements CustomerRepository {

    private ArrayList<Customer> customersList = new ArrayList<>();
    private CustomerRepositoryImpl(){};
    private static CustomerRepositoryImpl customerRepository;

    public static CustomerRepositoryImpl getInstance() {
        if (customerRepository==null){
            customerRepository = new CustomerRepositoryImpl();
            return customerRepository;
        }
        return customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        Customer customer1 = null;
        if (customersList.add(customer)) {
            customer1 = customer;
        }
        return customer1;
    }

    @Override
    public Customer[] getAllCustomers() {
        Customer[] array = customersList.toArray(new Customer[customersList.size()]);
        return array;
    }

    @Override
    public Customer getCustomerById(int id) {
        for (Customer customer : customersList) {
            if(customer.getCustomerId() == id){
                return customer;
            }
        }
        return null;
    }

    @Override
    public String deleteCustomerById(int id) {
        Customer customer = this.getCustomerById(id);
        if(customer != null){
            if(customersList.remove(customer)){
                return "done";
            }
            else{
                return "fail";
            }
        }
        return "not found";
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        for(Customer customer1 : customersList){
            if(customer1.getCustomerId() == id){
                customer1 = customer;
            }
        }
        return null;
    }
}
