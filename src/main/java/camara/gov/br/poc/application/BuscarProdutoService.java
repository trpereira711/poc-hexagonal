package camara.gov.br.poc.application;

import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.domain.repository.ProdutoRepository;

public class BuscarProdutoService {

    private final ProdutoRepository produtoRepository;

    public BuscarProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto recuperaProdutoPorId(Long id) {
        return produtoRepository.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
}
