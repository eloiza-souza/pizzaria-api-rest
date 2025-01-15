package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.CustomerDTO;
import com.zup.pizzaria.models.CustomerModel;
import com.zup.pizzaria.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createOrder(@RequestBody CustomerModel customerModel) {
        CustomerDTO customerDTO = customerService.createClient(customerModel);
        return ResponseEntity.ok(customerDTO);
    }

    @GetMapping
    public List<CustomerDTO> getAllClient(){

        List<CustomerModel> customersModel = customerService.getAllClient();

        return customersModel.stream()
                .map(customerModel -> new CustomerDTO(
                        customerModel.getId(),
                        customerModel.getName(),
                        customerModel.getEmail()
                ))
                .collect(Collectors.toList());
    }
}
