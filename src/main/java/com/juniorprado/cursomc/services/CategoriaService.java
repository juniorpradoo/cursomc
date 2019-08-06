package com.juniorprado.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juniorprado.cursomc.domain.Categoria;
import com.juniorprado.cursomc.repositories.CategoriaRespository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRespository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
}
