# Camada de Aplicação

## Propósito
Atua como intermediária entre o domínio da aplicação e a infraestrutura externa, coordenando as ações entre pedidos externos e operações de negócio.

## Responsabilidades
- Orquestrar operações de negócio, chamando serviços do domínio.
- Lógica específica da aplicação não pertencente ao núcleo de negócios.

## Fronteiras
- Depende diretamente da Camada de Domínio.
- Não deve ter dependências diretas com a Camada de Infraestrutura ou Adaptadores.

## Ports (Portas)
- Portas de Entrada: Interfaces para acesso aos serviços da aplicação.

## Adapters (Adaptadores)
- Não há adaptadores nesta camada.
