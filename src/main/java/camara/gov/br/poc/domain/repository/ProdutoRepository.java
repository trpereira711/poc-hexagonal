package camara.gov.br.poc.domain.repository;

import camara.gov.br.poc.domain.model.Produto;

import java.util.Optional;

public interface ProdutoRepository {

    Produto criarProduto(Produto produto);

    Optional<Produto> buscarPorId(Long id);
}
