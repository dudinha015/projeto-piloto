package com.mariaeduarda.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mariaeduarda.petshop.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}