package com.juniorprado.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juniorprado.cursomc.domain.Categoria;
import com.juniorprado.cursomc.domain.Produto;
import com.juniorprado.cursomc.repositories.CategoriaRespository;
import com.juniorprado.cursomc.repositories.ProdutoRespository;

@SpringBootApplication
public class CursomcApplication  implements CommandLineRunner {

	@Autowired
	private CategoriaRespository categoriaRespository;
	@Autowired
	private ProdutoRespository produtoRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRespository.save(Arrays.asList(cat1, cat2));
		produtoRespository.save(Arrays.asList(p1,p2,p3));
		
	}
	
	

}
