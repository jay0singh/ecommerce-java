package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;

public interface CustomerRepository {
    public Customer addCustomer(Customer customer);
    public Customer[] getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomerById(int id);
    public Customer updateCustomerById(int id, Customer customer);
}
