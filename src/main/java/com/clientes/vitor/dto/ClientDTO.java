package com.clientes.vitor.dto;

import com.clientes.vitor.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 60, message = "Nome precisa ter entre 3 a 60 caracteres")
    @NotBlank(message = "Campo Requirido")
    private String name;
    private String cpf;
    @PositiveOrZero(message = "Renda Deve ser positiva ou zero")
    private Double income;
    @PastOrPresent(message = "Data deve ser passada ou presente")
    private LocalDate birthDate;
    @PositiveOrZero(message = "Filho Deve ser zero ou positivo")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
