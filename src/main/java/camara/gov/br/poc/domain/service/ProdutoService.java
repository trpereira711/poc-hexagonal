package camara.gov.br.poc.domain.service;

import camara.gov.br.poc.application.ports.input.ProdutoInputPort;
import camara.gov.br.poc.application.ports.output.ProdutoOutputPort;
import camara.gov.br.poc.domain.exception.ProdutoNotFoundException;
import camara.gov.br.poc.domain.model.Produto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoService implements ProdutoInputPort {

    private final ProdutoOutputPort produtoOutputPort;

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoOutputPort.criarProduto(produto);
    }

    @Override
    public Produto buscarProduto(Long id) {
        return produtoOutputPort.buscarPorId(id)
                .orElseThrow(() -> new ProdutoNotFoundException());
    }
}
