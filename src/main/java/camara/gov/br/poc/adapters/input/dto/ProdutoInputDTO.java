package camara.gov.br.poc.adapters.input.dto;

import camara.gov.br.poc.domain.model.Produto;

import java.math.BigDecimal;

public record ProdutoInputDTO(String nome, BigDecimal preco) {

    public Produto toEntity() {
        return new Produto(this.nome, this.preco);
    }
}
