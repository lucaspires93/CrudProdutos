package com.produtos.crudProdutos.repository;

import com.produtos.crudProdutos.model.Produtos;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    Optional<Produtos> findById(Long id);

    @Transactional
    void deleteById(Long id);
}
