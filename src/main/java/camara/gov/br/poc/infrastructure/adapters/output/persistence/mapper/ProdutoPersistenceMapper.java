package camara.gov.br.poc.infrastructure.adapters.output.persistence.mapper;

import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.infrastructure.adapters.output.persistence.entity.ProdutoEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProdutoPersistenceMapper {

    ProdutoEntity toEntity(Produto produto);

    Produto toDomain(ProdutoEntity produtoEntity);
}
