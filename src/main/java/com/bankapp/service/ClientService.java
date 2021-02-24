package com.bankapp.service;

import com.bankapp.model.Client;
import com.bankapp.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {


    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClient(Integer id ){
        return clientRepository.findById(id).get();
    }

}
