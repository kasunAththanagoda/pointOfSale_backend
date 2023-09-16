package com.pos.pointOfSale.controller;

import com.pos.pointOfSale.dto.CustomerDTO;
import com.pos.pointOfSale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

//    @GetMapping
//    public String getMyText(){
//        String myText="Hello Springboot";
//        System.out.println(myText);
//        return myText;
//    }
    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
//        System.out.println("details :"+customerDTO.getCustomerName());

        return customerService.addCustomer(customerDTO);
    }
}
//