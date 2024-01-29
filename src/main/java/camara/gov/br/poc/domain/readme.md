# Camada de Domínio

## Propósito
Esta camada é o coração da nossa aplicação. Contém a lógica de negócio central e é independente de outras camadas, como Aplicação e Infraestrutura.

## Responsabilidades
- **Model**: Representa as entidades de negócio.
- **Repository**: Interfaces para a persistência de dados.

## Fronteiras
- Não deve ter dependências sobre nenhuma outra camada do modelo.

## Ports (Portas)
- Não há portas definidas nesta camada, pois representa o núcleo do negócio.

## Adapters (Adaptadores)
- Não há adaptadores nesta camada.
