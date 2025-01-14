package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.ClientDTO;
import com.zup.pizzaria.models.ClientModel;
import com.zup.pizzaria.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> createOrder(@RequestBody ClientModel client) {
        ClientDTO clientDTO = clientService.createClient(client);
        return ResponseEntity.ok(clientDTO);
    }
}
