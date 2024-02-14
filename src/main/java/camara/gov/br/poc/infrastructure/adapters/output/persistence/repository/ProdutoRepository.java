package camara.gov.br.poc.infrastructure.adapters.output.persistence.repository;

import camara.gov.br.poc.infrastructure.adapters.output.persistence.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
