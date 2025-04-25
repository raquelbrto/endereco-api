package com.dev.brito.enderecoapi.dtos;

import lombok.Builder;

@Builder
public record EnderecoViaCepDTO(String cep, String logradouro, String localidade, String bairro, String uf) {

    public CepDTO toCepDTO() {
        return CepDTO.builder()
                .cep(this.cep)
                .bairro(this.bairro)
                .cidade(this.localidade)
                .estado(this.uf)
                .logradouro(this.logradouro)
                .build();
    }
}
