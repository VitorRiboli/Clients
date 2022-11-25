package com.clientes.vitor.controllers;

import com.clientes.vitor.dto.ClientDTO;
import com.clientes.vitor.entities.Client;
import com.clientes.vitor.repositories.ClientRepository;
import com.clientes.vitor.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController //Configura está classe para responder as Requesições da Web
@RequestMapping(value = "/clients") //Configura a rota
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
