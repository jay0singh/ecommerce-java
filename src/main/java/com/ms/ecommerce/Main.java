package com.ms.ecommerce;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Orders;
import com.ms.ecommerce.service.CustomerService;
import com.ms.ecommerce.service.CustomerServiceImpl;
import com.ms.ecommerce.service.OrderService;
import com.ms.ecommerce.service.OrderServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = CustomerServiceImpl.getInstance();

        Customer customer = new Customer(1,
                "Jay","Singh",
                "jaysingha261@gmail.com","1234567890");
        Customer customer1 = customerService.addCustomer(customer);

        OrderService orderService = OrderServiceImpl.getInstance();

        Orders order = new Orders(1,1,LocalDate.now());
        Orders order1 = orderService.addOrder(order);

        System.out.println(order);
    }
}
//    public static void main(String[] args) {
//        CustomerService customerService =new CustomerService() {
//            @Override
//            public Customer addCustomer(Customer customer) {
//                return new Customer(1,
//                        "abhi","chivate",
//                        "abhij@gmaiil.com","1234567890");
//            }
//
//            @Override
//            public String test() {
//                //return CustomerService.super.test();
//                return "Hello Again";
//            }
//        };
//        String res = customerService.test();
//        System.out.println(res);
//        System.out.println(customerService.addCustomer(new Customer()));
//        CustomerService customerService1 =
//                customer ->new Customer(1,
//                        "advik","chivate",
//                        "advik@gmaiil.com","1234567890");;
//
//        System.out.println(customerService1.addCustomer(new Customer()));
//        String result =customerService1.test();
//        System.out.println(result);
//    };
//
//}