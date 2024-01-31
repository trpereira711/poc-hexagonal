package camara.gov.br.poc.infrastructure.adapters.input.rest;

import camara.gov.br.poc.application.ports.input.BuscarProdutoInputPort;
import camara.gov.br.poc.application.ports.input.CriarProdutoInputPort;
import camara.gov.br.poc.domain.model.Produto;
import camara.gov.br.poc.infrastructure.adapters.output.dto.ProdutoOutputDTO;
import camara.gov.br.poc.infrastructure.adapters.input.dto.ProdutoInputDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutoResourceAdapter {

    private final CriarProdutoInputPort criarProdutoInputPort;
    private final BuscarProdutoInputPort buscarProdutoInputPort;

    @PostMapping
    public ResponseEntity<ProdutoOutputDTO> criarProduto(@RequestBody ProdutoInputDTO produtoInputDTO) throws URISyntaxException {
        Produto produto = Produto.builder()
                .nome(produtoInputDTO.nome())
                .preco(produtoInputDTO.preco())
                .build();

        produto = criarProdutoInputPort.execute(produto);
        var produtoOutputDTO = new ProdutoOutputDTO(produto.getId(), produto.getNome(), produto.getPreco());
        return ResponseEntity.created(new URI("/produtos/" + produtoOutputDTO.id()))
                .body(produtoOutputDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoOutputDTO> recuperaProdutoPorId(@PathVariable Long id) {
        Produto produto = buscarProdutoInputPort.execute(id);
        return ResponseEntity.ok(new ProdutoOutputDTO(produto.getId(), produto.getNome(), produto.getPreco()));
    }
}
