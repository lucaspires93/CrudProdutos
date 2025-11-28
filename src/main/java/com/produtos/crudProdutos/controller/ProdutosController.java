package com.produtos.crudProdutos.controller;

import com.produtos.crudProdutos.model.Produtos;
import com.produtos.crudProdutos.service.ProdutosService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private final ProdutosService produtosService;


    public ProdutosController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    @PostMapping
    public Produtos criarProduto(@RequestBody Produtos produtos) {
        return produtosService.salvarProduto(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProduto(@PathVariable Long id) {
        Produtos produtos = produtosService.buscarProdutoPorId(id);
        return ResponseEntity.ok(produtos);
    }

    @GetMapping
    public List<Produtos> listarProdutos(){
        return produtosService.listarProdutos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutos(@PathVariable Long id){
        produtosService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarProduto(@PathVariable Long id, @RequestBody Produtos produtos){
        produtosService.atualizarProdutoPorId(id, produtos);
        return ResponseEntity.ok().build();
    }

}
