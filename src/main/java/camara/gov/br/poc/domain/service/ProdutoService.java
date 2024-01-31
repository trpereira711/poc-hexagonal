package camara.gov.br.poc.domain.service;

import camara.gov.br.poc.application.ports.input.BuscarProdutoInputPort;
import camara.gov.br.poc.application.ports.input.CriarProdutoInputPort;
import camara.gov.br.poc.application.ports.output.ProdutoOutputPort;
import camara.gov.br.poc.domain.exception.ProdutoNotFoundException;
import camara.gov.br.poc.domain.model.Produto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoService implements CriarProdutoInputPort, BuscarProdutoInputPort {

    private final ProdutoOutputPort produtoOutputPort;

    @Override
    public Produto execute(Produto produto) {
        return produtoOutputPort.criarProduto(produto);
    }

    @Override
    public Produto execute(Long id) {
        return produtoOutputPort.buscarPorId(id)
                .orElseThrow(() -> new ProdutoNotFoundException());
    }
}
