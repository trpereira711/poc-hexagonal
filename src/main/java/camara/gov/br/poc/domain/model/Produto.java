package camara.gov.br.poc.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"id", "preco"})
public class Produto {
    private Long id;
    private String nome;
    private BigDecimal preco;
}
