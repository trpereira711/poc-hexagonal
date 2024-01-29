package camara.gov.br.poc.adapters.input;

import camara.gov.br.poc.adapters.input.dto.ProdutoInputDTO;
import camara.gov.br.poc.adapters.output.dto.ProdutoOutputDTO;
import camara.gov.br.poc.application.CriarProdutoService;
import camara.gov.br.poc.domain.model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    private final CriarProdutoService produtoService;

    public ProdutoResource(CriarProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<ProdutoOutputDTO> criarProduto(@RequestBody ProdutoInputDTO produtoInputDTO) throws URISyntaxException {
        Produto produtoCriado = produtoService.criarProduto(produtoInputDTO.toEntity());

        var produtoOutputDTO = ProdutoOutputDTO.toOutput(produtoCriado);

        return ResponseEntity.created(new URI("/produtos/" + produtoOutputDTO.id()))
                .body(produtoOutputDTO);
    }
}
