package com.techgustarodrigues.register.address.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}
