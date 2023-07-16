package com.abdul.customer.service;


import com.abdul.customer.dao.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    public static int id = 100;
    List<Customer> profileList = new ArrayList<>();

    @Override
    public String register(String name, byte age, short income) {
        Customer p = new Customer(id++, name,  age, income);
        profileList.add(p);
        return "Registration is Successful with details: "+ p;
    }

    @Override
    public List<Customer> viewProfiles() {
        return profileList;
    }

    @Override
    public String findAndUpdate() {
//        Profile p = profileList.stream().filter(e->e.getId()==id).collect(Collectors.);
        return "This Feature will be implemented soon";
    }
}

