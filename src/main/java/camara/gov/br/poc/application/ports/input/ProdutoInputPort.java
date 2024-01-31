package camara.gov.br.poc.application.ports.input;

import camara.gov.br.poc.domain.model.Produto;

public interface ProdutoInputPort {

    Produto criarProduto(Produto produto);

    Produto buscarProduto(Long id);
}
