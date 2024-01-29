# Camada de Infraestrutura

## Propósito
Contém aspectos técnicos do projeto como banco de dados, frameworks e implementações de interfaces do domínio.

## Responsabilidades
- **Persistence**: Implementações concretas das interfaces de repositório do domínio.

## Fronteiras
- Implementa as interfaces definidas na Camada de Domínio.
- Não deve depender da Camada de Aplicação ou dos Adaptadores.

## Ports (Portas)
- Portas de Saída: Implementações de interfaces do domínio para interação com recursos externos.

## Adapters (Adaptadores)
- Adaptadores de Saída: Conectam a aplicação a sistemas externos.
