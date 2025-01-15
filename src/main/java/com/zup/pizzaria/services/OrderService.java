package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.OrderDTO;
import com.zup.pizzaria.models.CustomerModel;
import com.zup.pizzaria.models.OrderModel;
import com.zup.pizzaria.repositories.CustomerRepository;
import com.zup.pizzaria.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public OrderService(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    public OrderDTO createOrder (OrderModel order){
        CustomerModel customerModel = customerRepository.
                findById(order.getCustomerId()).
                orElseThrow(()-> new RuntimeException("Cliente não encontrado"));
        orderRepository.save(order);
        return new OrderDTO(customerModel.getName(), customerModel.getEmail(),order.getDescription());
    }
}
