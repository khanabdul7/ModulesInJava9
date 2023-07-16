package com.abdul.customer.service;



import com.abdul.customer.dao.Customer;

import java.util.List;

public interface CustomerService {
    String register(String name, byte age, short income);
    List<Customer> viewProfiles ();

    String findAndUpdate();
}

