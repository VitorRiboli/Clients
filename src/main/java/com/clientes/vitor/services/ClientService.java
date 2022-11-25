package com.clientes.vitor.services;

import com.clientes.vitor.dto.ClientDTO;
import com.clientes.vitor.entities.Client;
import com.clientes.vitor.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository rep;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = rep.findById(id).get();
        return new ClientDTO(client);

    }

}
