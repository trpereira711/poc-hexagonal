package camara.gov.br.poc.infrastructure.adapters.config;

import camara.gov.br.poc.domain.service.ProdutoService;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.ProdutoPersistenceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    ProdutoService produtoService(ProdutoPersistenceAdapter produtoPersistenceAdapter) {
        return new ProdutoService(produtoPersistenceAdapter);
    }
}
