# POC - Arquitetura Hexagonal

## Visão Geral
Este projeto implementa a arquitetura hexagonal, também conhecida como "ports and adapters". Esta abordagem arquitetônica foca na separação de preocupações, promovendo a independência entre a lógica de negócios da aplicação e fatores externos como banco de dados, interfaces de usuário e integrações com sistemas externos.

## Estrutura de Diretórios
O projeto é organizado em várias camadas, cada uma com responsabilidades claramente definidas:

- `domain/`: Núcleo da lógica de negócios.
- `application/`: Coordena as operações de negócios.
- `infrastructure/`: Detalhes técnicos como banco de dados e frameworks.
- `adapters/`: Conecta a aplicação com o mundo externo.

## Arquitetura Hexagonal (Ports and Adapters)
Na arquitetura hexagonal, o sistema é dividido em uma parte interna e uma parte externa:

- **Parte Interna**: Composta pelas camadas de `domain` e `application`, representa a lógica de negócios e as operações da aplicação.
- **Parte Externa**: Composta pelas camadas de `infrastructure` e `adapters`, lida com interações com o mundo externo, como interfaces de usuário, banco de dados e integrações com sistemas externos.

### Ports (Portas)
As portas são interfaces que definem os pontos de interação entre a parte interna e externa do sistema. Existem dois tipos principais de portas:

- **Portas de Entrada**: Usadas para enviar comandos ou dados para a aplicação.
- **Portas de Saída**: Usadas pela aplicação para interagir com sistemas externos.

### Adapters (Adaptadores)
Os adaptadores são implementações concretas das portas. Eles adaptam a comunicação entre a aplicação e o mundo externo. Existem dois tipos principais de adaptadores:

- **Adaptadores de Entrada**: Adaptam dados de entrada do mundo externo para a forma esperada pela aplicação.
- **Adaptadores de Saída**: Adaptam dados de saída da aplicação para o formato adequado para sistemas externos ou interfaces de usuário.

## Referências
- [Arquitetura Hexagonal explicada](https://alistair.cockburn.us/hexagonal-architecture/)
- [Ports and Adapters Pattern](https://martinfowler.com/articles/patterns-of-distributed-systems/ports-and-adapters.html)
- [Implementando Arquitetura Hexagonal em Java](https://www.baeldung.com/hexagonal-architecture-ddd-spring)

---

Este `README.md` serve como uma introdução ao projeto e à arquitetura utilizada, facilitando o entendimento geral do sistema para novos desenvolvedores e interessados.
