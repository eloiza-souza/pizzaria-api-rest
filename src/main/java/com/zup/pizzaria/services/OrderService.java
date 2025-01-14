package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.OrderDTO;
import com.zup.pizzaria.models.ClientModel;
import com.zup.pizzaria.models.OrderModel;
import com.zup.pizzaria.repositories.ClientRepository;
import com.zup.pizzaria.repositories.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ClientRepository clientRepository;
    private OrderRepository orderRepository;

    public OrderService(ClientRepository clientRepository, OrderRepository orderRepository) {
        this.clientRepository = clientRepository;
        this.orderRepository = orderRepository;
    }

    public OrderDTO createOrder (OrderModel order){
        orderRepository.save(order);

        ClientModel client = clientRepository.
                findById(order.getClientId()).
                orElseThrow(()-> new RuntimeException("Cliente não encontrado"));

        return new OrderDTO(client.getName(), client.getEmail(),order.getDescription());
    }
}
