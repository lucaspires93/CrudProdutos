package com.produtos.crudProdutos.service;

import com.produtos.crudProdutos.exceptions.RecursoNaoEncontrado;
import com.produtos.crudProdutos.model.Produtos;
import com.produtos.crudProdutos.repository.ProdutosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    private final ProdutosRepository produtosRepository;

    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public Produtos salvarProduto(Produtos produto) {
        return produtosRepository.save(produto);
    }

    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }

    public Produtos buscarProdutoPorId(Long id) {
        return produtosRepository.findById(id).orElseThrow(
                () -> new RecursoNaoEncontrado("Produto com ID " + id + " não encontrado."));
    }

    public void deletarProduto(Long id) {
        if (!produtosRepository.existsById(id)) {
            throw new RecursoNaoEncontrado("Produto com ID " + id + " não encontrado.");
        }
        produtosRepository.deleteById(id);
    }

    public Produtos atualizarProdutoPorId(Long id, Produtos produto) {
        Produtos produtoEntity = produtosRepository.findById(id).orElseThrow(
                () -> new RecursoNaoEncontrado("Produto com ID " + id + " não encontrado."));
        Produtos produtoAtualizado = Produtos.builder()
                .id(produtoEntity.getId())
                .nome(produto.getNome() != null ? produto.getNome() : produtoEntity.getNome())
                .quantidade(produto.getQuantidade() != null ? produto.getQuantidade() : produtoEntity.getQuantidade())
                .preco(produto.getPreco() != null ? produto.getPreco() : produtoEntity.getPreco())
                .build();

        return produtosRepository.save(produtoAtualizado);
    }
}
