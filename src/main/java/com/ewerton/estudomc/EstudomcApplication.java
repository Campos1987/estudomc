package com.ewerton.estudomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ewerton.estudomc.domain.Categoria;
import com.ewerton.estudomc.repositories.CategoriaRepository;

@SpringBootApplication
public class EstudomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository; 

	public static void main(String[] args) {
		SpringApplication.run(EstudomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
