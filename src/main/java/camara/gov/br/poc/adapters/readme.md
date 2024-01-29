# Adaptadores

## Propósito
Os adaptadores fazem a ponte entre o nosso aplicativo e o mundo externo. Eles adaptam dados e chamadas de e para formatos que nossa aplicação pode entender e usar.

## Responsabilidades
- **Input/DTO**: Definem Data Transfer Objects para entrada de dados. São utilizados para receber dados de fontes externas e convertê-los em formatos que a camada de aplicação pode processar.
- **Output/DTO**: Definem Data Transfer Objects para saída de dados. São utilizados para converter dados da camada de aplicação para formatos que podem ser entregues a fontes externas.

## Importante
Esta camada é responsável por traduzir dados entre a aplicação e agentes externos, mantendo a independência do núcleo de negócio.

## Fronteiras
- Os adaptadores dependem da **Camada de Aplicação** para solicitar e receber dados processados.
- Em alguns casos, podem interagir diretamente com a **Camada de Domínio**, especialmente em casos onde a transformação de dados é simples e não requer lógica de aplicação.
- **Não** devem ter dependências com a Camada de Infraestrutura, mantendo a separação entre as preocupações de interface e técnicas.
