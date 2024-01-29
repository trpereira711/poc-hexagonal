# Camada de Aplicação

## Propósito
Esta camada age como um mediador entre a infraestrutura externa e a camada de domínio. Ela coordena as ações entre os pedidos externos (como comandos da web ou API) e as operações de negócio.

## Responsabilidades
- Orquestrar operações de negócio, chamando serviços do domínio.
- Pode conter lógica específica da aplicação que não pertence ao núcleo de negócios.

## Importante
Esta camada não deve conter lógica de negócio complexa, que deve residir no domínio.

## Fronteiras
- Esta camada depende diretamente da **Camada de Domínio** para realizar operações de negócio.
- **Não** deve ter dependências diretas com a Camada de Infraestrutura ou Adaptadores, mantendo-se isolada das preocupações técnicas e de interfaces externas.
