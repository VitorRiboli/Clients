package com.clientes.vitor.repositories;

import com.clientes.vitor.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
