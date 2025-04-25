package com.dev.brito.enderecoapi.controller;

import com.dev.brito.enderecoapi.dtos.CepDTO;
import com.dev.brito.enderecoapi.service.CepService;
import com.dev.brito.enderecoapi.service.impl.CepServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/endereco")
public class CepController {

    private final CepServiceImpl cepService;

    @GetMapping("/{cep}")
    public CepDTO getEnderecoByCep(@PathVariable String cep) {
        return cepService.findEndereco(cep);
    }
}
