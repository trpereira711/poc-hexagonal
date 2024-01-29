# Camada de Infraestrutura

## Propósito
Esta camada contém tudo relacionado à infraestrutura técnica do projeto, como banco de dados, frameworks, bibliotecas externas e implementações de interfaces do domínio.

## Responsabilidades
- **Persistence**: Implementações concretas das interfaces de repositório definidas na camada de domínio. Aqui, detalhes sobre o acesso a dados são implementados.

## Importante
Deve ser a única camada que conhece os detalhes técnicos de implementação da infraestrutura.

## Fronteiras
- Esta camada implementa as interfaces definidas na **Camada de Domínio**, portanto, depende diretamente dela.
- Pode ter dependências de bibliotecas externas e frameworks necessários para a implementação de detalhes técnicos.
- **Não** deve depender diretamente da Camada de Aplicação ou dos Adaptadores.
