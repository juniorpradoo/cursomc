package com.juniorprado.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juniorprado.cursomc.domain.Produto;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Integer> {

}
