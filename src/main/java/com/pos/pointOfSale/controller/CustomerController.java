package com.pos.pointOfSale.controller;

import com.pos.pointOfSale.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

//    @GetMapping
//    public String getMyText(){
//        String myText="Hello Springboot";
//        System.out.println(myText);
//        return myText;
//    }
    @PostMapping(path = "/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("details :"+customerDTO.getCustomerName());
        return null;
    }
}
