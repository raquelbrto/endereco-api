package com.dev.brito.enderecoapi.dtos;

import lombok.*;

@Builder
public record CepDTO(String cep, String logradouro, String cidade, String bairro, String estado) {
}
