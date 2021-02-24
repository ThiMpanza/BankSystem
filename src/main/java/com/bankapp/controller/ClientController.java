package com.bankapp.controller;

import com.bankapp.model.Client;
import com.bankapp.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getClient/{id}")
    public Client getClient(@PathVariable Integer id){
        return clientService.getClient(id);

    }
}
