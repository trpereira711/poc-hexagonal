package camara.gov.br.poc.infrastructure.adapters.output.persistence;


import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.application.ports.output.ProdutoOutputPort;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.entity.ProdutoEntity;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.mapper.ProdutoPersistenceMapper;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ProdutoPersistenceAdapter implements ProdutoOutputPort {
    private final ProdutoRepository produtoRepository;

    private final ProdutoPersistenceMapper produtoPersistenceMapper;

    @Override
    public Produto criarProduto(Produto produto) {
        ProdutoEntity produtoEntity = produtoPersistenceMapper.toEntity(produto);
        produtoEntity = produtoRepository.save(produtoEntity);
        return produtoPersistenceMapper.toDomain(produtoEntity);
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return Optional.ofNullable(produtoRepository.findById(id)
                .map(produtoPersistenceMapper::toDomain)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado para o id: " + id)));
    }
}
