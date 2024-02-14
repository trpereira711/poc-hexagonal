package camara.gov.br.poc.application;

import camara.gov.br.poc.domain.exception.ProdutoNotFoundException;
import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.ProdutoPersistenceAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoPort {

    private final ProdutoPersistenceAdapter produtoPersistenceAdapter;

    public Produto criarProduto(Produto produto) {
        return produtoPersistenceAdapter.criarProduto(produto);
    }

    public Produto buscarProduto(Long id) {
        return produtoPersistenceAdapter.buscarPorId(id)
                .orElseThrow(ProdutoNotFoundException::new);
    }
}
