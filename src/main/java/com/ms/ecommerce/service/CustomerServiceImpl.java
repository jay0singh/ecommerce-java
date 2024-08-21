package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepositoryImpl customerRepository = CustomerRepositoryImpl.getInstance();

    private CustomerServiceImpl(){}
    private static CustomerServiceImpl customerService;

    public static CustomerServiceImpl getInstance() {
        if (customerService==null){
            System.out.println("Inside");
            customerService = new CustomerServiceImpl();
            return customerService;
        }
        return customerService;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    @Override
    public Customer[] getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public String deleteCustomerById(int id) {
        return customerRepository.deleteCustomerById(id);
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        return customerRepository.updateCustomerById(id, customer);
    }
}
