package com.juniorprado.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juniorprado.cursomc.domain.Categoria;
import com.juniorprado.cursomc.repositories.CategoriaRespository;

@SpringBootApplication
public class CursomcApplication  implements CommandLineRunner {

	@Autowired
	private CategoriaRespository categoriaRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "excritorio");
		
		categoriaRespository.save(Arrays.asList(cat1, cat2));
		
	}
	
	

}
