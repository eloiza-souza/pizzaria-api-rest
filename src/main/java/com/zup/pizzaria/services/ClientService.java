package com.zup.pizzaria.services;

import com.zup.pizzaria.models.ClientModel;
import com.zup.pizzaria.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientModel createClient(String name, String email){
        ClientModel client = new ClientModel(name, email);
        clientRepository.save(client);
        return client;
    }

}
