package camara.gov.br.poc.application.ports.input;


import camara.gov.br.poc.domain.model.Produto;

public interface CriarProdutoInputPort {
    public Produto execute(Produto produto);
}
