package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClientDTO;
import com.zup.pizzaria.models.ClientModel;
import com.zup.pizzaria.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDTO createClient(ClientModel client){
        clientRepository.save(client);
        return new ClientDTO(client.getId(), client.getName(), client.getEmail());
    }


}
