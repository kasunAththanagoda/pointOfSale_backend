package com.pos.pointOfSale.service.impl;

import com.pos.pointOfSale.dto.CustomerDTO;
import com.pos.pointOfSale.entity.Customer;
import com.pos.pointOfSale.repositery.CustomerRepo;
import com.pos.pointOfSale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        Customer customer=new Customer(
                customerDTO.getCutomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getSalary(),
                customerDTO.getContactNumber(),
                customerDTO.getNic(),
                customerDTO.isActiveStatus()
        );

        customerRepo.save(customer);

        return customer.getCustomerName()+" saved successfully";
    }
}
