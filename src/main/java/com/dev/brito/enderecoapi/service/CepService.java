package com.dev.brito.enderecoapi.service;

import com.dev.brito.enderecoapi.dtos.CepDTO;

public interface CepService {

    CepDTO findEndereco(String cep);
}
