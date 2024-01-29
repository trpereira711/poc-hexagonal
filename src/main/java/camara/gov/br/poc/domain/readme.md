# Camada de Domínio

## Responsabilidade
Esta camada é responsável pela lógica de negócio e pelas regras do domínio. Ela é o coração do nosso sistema, onde definimos nossas entidades e a lógica que rege como essas entidades interagem entre si.

## Conteúdo
- **Model**: Classes que representam as entidades do domínio.
- **Repository**: Interfaces que definem os contratos para operações de persistência, independentes de qualquer tecnologia de armazenamento.

## Fronteiras
- Esta camada **não** deve ter dependências sobre nenhuma outra camada do modelo, como Aplicação, Infraestrutura ou Adaptadores.
- Ela deve ser independente, contendo a lógica de negócios e regras que não são afetadas por elementos externos.
