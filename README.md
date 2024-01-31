# Como Ensinar o Essencial da Arquitetura de Portas e Adaptadores

Por experiência própria, percebi que as explicações usuais sobre portas e adaptadores não são muito eficazes para esclarecer o conceito de Portas e Adaptadores[0][1][2]. Ao compartilhar os artigos comuns com desenvolvedores iniciantes, é provável que eles fiquem confusos, não compreendam o ponto principal ou, mais comumente, acabem tirando conclusões erradas (como pensar que o importante é a nomenclatura). Portanto, precisamos melhorar a forma como ensinamos esse conceito. Esta é a minha abordagem para explicar essa arquitetura.

Do ponto de vista pedagógico, parece que as explicações se perdem em detalhes, fazendo com que a ideia central não fique clara. Para piorar, os artigos sobre o tema tendem a estar repletos de jargões técnicos desnecessários, complicando ainda mais a compreensão. Ao ler o artigo original sobre portas e adaptadores[0], você provavelmente sentirá uma saturação semântica da palavra 'porta'. Outras descrições populares na internet não são melhores, utilizando termos como 'camadas de transporte', 'Interatores' e outras complexidades[1]. Se você explorar a versão chamada 'arquitetura limpa', encontrará um livro de mais de 300 páginas repleto de jargões do Tio Bob[4]. Apresentar qualquer um desses materiais a um iniciante pode deixá-lo com a impressão de que Portas e Adaptadores é uma arquitetura extremamente complexa e superelaborada.

Ao explicar, é crucial ignorar todos os detalhes e focar no essencial da arquitetura, que é simplesmente:

## Escreva seu código de forma que possa adicionar novas maneiras de interagir com o mundo mais tarde sem ter que modificar o que já foi feito.

É só isso. Essa é a explicação completa. Ao ensinar, evite mencionar 'Portas', 'Hexágonos' ou outras formas, e concentre-se em explicar a qualidade que desejamos em nossa arquitetura. Uma boa arquitetura nos permite adicionar novas formas de comunicação com o mundo externo sem necessidade de alterar o código existente. É isso que buscamos.

Então, apresente um desafio: escolha duas formas muito diferentes de interagir com o mundo, como uma API HTTP e uma CLI local, e questione como eles estruturariam o código para que ele pudesse atender a ambas as conexões com o mundo externo. Naturalmente, os demais jargões técnicos se encaixam sem serem definidos ou explicados explicitamente, porque há basicamente apenas uma maneira óbvia de fazer isso: desacoplar o núcleo do programa do mundo externo, criando uma interface padronizada (isto é, uma porta)[5] para que novas partes possam se comunicar, e construir adaptadores para transferir dados para dentro e para fora dessa interface. Eles ainda terão dúvidas sobre os limites exatos, mas isso tende a internalizar a essência da arquitetura.

Uma vez compreendida a ideia central, então você pode revelar que "a propósito, essa abordagem é geralmente chamada de {escolha seu termo preferido}", e eles terão as ferramentas para realmente entender os detalhes.

Notas de rodapé:
[0] https://alistair.cockburn.us/hexagonal-architecture/
[1] https://netflixtechblog.com/ready-for-changes-with-hexagonal-architecture-b315ec967749
[2] https://www.kennethlange.com/ports-and-adapters/
[4] http://cleancoder.com/products
[5] "interface" usado apenas no sentido geral de contrato de API, não no sentido de Interface Java. Parem de escrever tantas interfaces inúteis de uma única vez, pessoal! Interfaces são para abstrações, não concretizações!"

## Referências
- [Como ensinar Ports and Adpters](https://chriskiehl.com/article/how-to-teach-ports-and-adapters)
---

Este `README.md` serve como uma introdução ao projeto e à arquitetura utilizada, facilitando o entendimento geral do sistema para novos desenvolvedores e interessados.
