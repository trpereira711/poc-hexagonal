package camara.gov.br.poc.infrastructure.configuration;

import camara.gov.br.poc.application.BuscarProdutoService;
import camara.gov.br.poc.application.CriarProdutoService;
import camara.gov.br.poc.domain.repository.ProdutoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    CriarProdutoService criarProduto(ProdutoRepository produtoRepository) {
        return new CriarProdutoService(produtoRepository);
    }
    @Bean
    BuscarProdutoService buscarProduto(ProdutoRepository produtoRepository) {
        return new BuscarProdutoService(produtoRepository);
    }
}
