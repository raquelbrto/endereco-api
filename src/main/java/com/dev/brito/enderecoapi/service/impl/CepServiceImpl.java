package com.dev.brito.enderecoapi.service.impl;

import com.dev.brito.enderecoapi.client.BrasilApiClient;
import com.dev.brito.enderecoapi.client.ViaCepClient;
import com.dev.brito.enderecoapi.dtos.CepDTO;
import com.dev.brito.enderecoapi.service.CepService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient viaCepClient;

    private final BrasilApiClient brasilApiClient;

    @Override
    @CircuitBreaker(name = "endereco", fallbackMethod = "failBackFindEndereco")
    public CepDTO findEndereco(String cep) {
        log.info("Tentando buscar endereço para CEP: {}", cep);
        if (cep.startsWith("0")) {
            log.warn("Forçando erro para testar Circuit Breaker");
            throw new RuntimeException("Forçando erro para testar Circuit Breaker");
        }
        return viaCepClient.findEnderecoViaCep(cep).toCepDTO();
    }

    public CepDTO failBackFindEndereco(String cep, Exception e) {
        log.error("Circuit Breaker Fallback acionado para CEP: {} - Erro: {}", cep, e.getMessage());
        return brasilApiClient.findEndereciBrasilApi(cep).toCepDTO();
    }
}
