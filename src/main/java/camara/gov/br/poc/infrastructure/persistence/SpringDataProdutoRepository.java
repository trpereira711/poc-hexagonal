package camara.gov.br.poc.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
