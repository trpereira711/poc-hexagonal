package camara.gov.br.poc.infrastructure.config;

import camara.gov.br.poc.application.ProdutoPort;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.ProdutoPersistenceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    ProdutoPort newProdutoPort(ProdutoPersistenceAdapter produtoPersistenceAdapter) {
        return new ProdutoPort(produtoPersistenceAdapter);
    }
}
