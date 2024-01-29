package camara.gov.br.poc.application;

import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.domain.repository.ProdutoRepository;


public class CriarProdutoService {

    private final ProdutoRepository produtoRepository;

    public CriarProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.criarProduto(produto);
    }
}
