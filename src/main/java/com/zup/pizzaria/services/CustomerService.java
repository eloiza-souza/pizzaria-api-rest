package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.CustomerDTO;
import com.zup.pizzaria.models.CustomerModel;
import com.zup.pizzaria.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO createClient(CustomerModel customerModel){
        customerRepository.save(customerModel);
        return new CustomerDTO(customerModel.getId(), customerModel.getName(), customerModel.getEmail());
    }

    public List<CustomerModel> getAllClient(){
        return customerRepository.findAll();
    }
}
