package com.minhaLojaDeGames.minhaLojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.CategoriaRepositorio;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepositorio repositorioDaCategoria;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		return ResponseEntity.ok(repositorioDaCategoria.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable Integer id){
		return repositorioDaCategoria.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorioDaCategoria.save(categoria));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> putCategoria(@PathVariable ("id") Integer id, @RequestBody AlterarCategoria alterarCategoria){
		
		Optional<Categoria> alterarCategoriaOptinal =  repositorioDaCategoria.findById(id);
		
		Categoria categoriaQueSeraAlterada = alterarCategoriaOptinal.get();
		
		categoriaQueSeraAlterada.setNome(alterarCategoria.getNome());
		categoriaQueSeraAlterada.setCategoria(alterarCategoria.getCategoria());
		
		repositorioDaCategoria.save(categoriaQueSeraAlterada);
		
		return ResponseEntity.ok(categoriaQueSeraAlterada);
		
	}
																				
		
	
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repositorioDaCategoria.deleteById(id);
		
	}
	


}
