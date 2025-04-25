package com.dev.brito.enderecoapi.client;

import com.dev.brito.enderecoapi.dtos.EnderecoBrasilApiDTO;
import com.dev.brito.enderecoapi.dtos.EnderecoViaCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br/api/")
public interface BrasilApiClient {

    @GetMapping("cep/v1/{cep}")
    EnderecoBrasilApiDTO findEndereciBrasilApi(@PathVariable("cep") String cep);
}
