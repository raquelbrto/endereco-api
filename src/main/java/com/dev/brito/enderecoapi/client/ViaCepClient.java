package com.dev.brito.enderecoapi.client;

import com.dev.brito.enderecoapi.dtos.EnderecoViaCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "viacep", url = "https://viacep.com.br/")
public interface ViaCepClient {

    @GetMapping("ws/{cep}/json/")
    EnderecoViaCepDTO findEnderecoViaCep(@PathVariable("cep") String cep);
}
