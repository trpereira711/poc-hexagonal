package camara.gov.br.poc.adapters.output.dto;

import camara.gov.br.poc.domain.model.Produto;

import java.math.BigDecimal;

public record ProdutoOutputDTO(Long id, String nome, BigDecimal preco) {

    public static ProdutoOutputDTO toOutput(Produto produto) {
        return new ProdutoOutputDTO(produto.getId(), produto.getNome(), produto.getPreco());
    }
}
