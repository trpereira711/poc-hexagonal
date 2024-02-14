package camara.gov.br.poc.infrastructure.adapters.output.dto;

import java.math.BigDecimal;

public record ProdutoOutputDTO(Long id, String nome, BigDecimal preco) {
}
