package camara.gov.br.poc.domain.model;

import camara.gov.br.poc.infrastructure.persistence.ProdutoEntity;

import java.math.BigDecimal;

public class Produto {

    private Long id;
    private String nome;
    private BigDecimal preco;

    // JPA
    public Produto() {
    }

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(Long id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
