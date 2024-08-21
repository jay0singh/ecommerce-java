package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Customer;
//@FunctionalInterface //Annotations for functional interface
public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public Customer[] getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomerById(int id);
    public Customer updateCustomerById(int id, Customer customer);
}
