package camara.gov.br.poc.domain.exception;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException() {
        super("Produto não encontrado.");
    }
}
