package camara.gov.br.poc.infrastructure.persistence;

import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.domain.repository.ProdutoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final SpringDataProdutoRepository repository;

    public ProdutoRepositoryImpl(SpringDataProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Produto criarProduto(Produto produto) {
        var novoProduto = new ProdutoEntity();
        novoProduto.toEntity(produto);

        ProdutoEntity produtoCriado = repository.save(novoProduto);
        return new Produto(produtoCriado.getId(), produtoCriado.getNome(), produtoCriado.getPreco());
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id)
                .map(p -> new Produto(p.getId(), p.getNome(), p.getPreco()));
    }
}
