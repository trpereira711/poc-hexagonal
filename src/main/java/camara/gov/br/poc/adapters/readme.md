# Adaptadores

## Propósito
Fazem a ponte entre o aplicativo e o mundo externo, adaptando dados e chamadas.

## Responsabilidades
- **Input/DTO**: Conversão de dados de entrada para formatos da aplicação.
- **Output/DTO**: Conversão de dados da aplicação para formatos externos.

## Fronteiras
- Dependem da Camada de Aplicação.
- Podem interagir com a Camada de Domínio para transformações simples de dados.

## Ports (Portas)
- Interage com portas definidas nas camadas de aplicação e domínio.

## Adapters (Adaptadores)
- Adaptadores de Entrada: Convertendo dados de fontes externas para o formato das portas de entrada.
- Adaptadores de Saída: Adaptando a saída da aplicação para o mundo externo.
