package com.dev.brito.enderecoapi.dtos;

import lombok.Builder;

@Builder
public record EnderecoBrasilApiDTO(String cep, String state, String city, String neighborhood, String street) {

    public CepDTO toCepDTO() {
        return  CepDTO.builder()
                .cep(this.cep)
                .estado(this.state)
                .cidade(this.city)
                .bairro(this.neighborhood)
                .logradouro(this.street)
                .build();
    }
}
