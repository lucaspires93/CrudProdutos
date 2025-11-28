package com.produtos.crudProdutos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "produtos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;
    @Column
    private Integer quantidade;
    @Column
    private Double preco;


}
