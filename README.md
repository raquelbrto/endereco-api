# Endereco API

- Tecnologias usadas:

    - Java 17
    - Spring framework 3.4.4
    - FeingClient
    - CircuitBreaker
    
Projeto criado para implementar e testar CircuitBreaker do resilience4j.

API é simples faz uma consulta a API do Via Cep, no momento em que o circuito abrir ele vai chamar o metodo de failBackFindEndereco e fazer as requisições para a Brasil API.
