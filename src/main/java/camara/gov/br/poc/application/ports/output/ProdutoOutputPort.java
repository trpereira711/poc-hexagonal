package camara.gov.br.poc.application.ports.output;

import camara.gov.br.poc.domain.model.Produto;

import java.util.Optional;

public interface ProdutoOutputPort {
    Produto criarProduto(Produto produto);

    Optional<Produto> buscarPorId(Long id);
}
