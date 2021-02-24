package com.farmacias.farmacia.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

import com.farmacias.farmacia.controller.payload.CadastroDeProduto;
import com.farmacias.farmacia.model.Categoria;
import com.farmacias.farmacia.model.Produto;
import com.farmacias.farmacia.repository.CategoriaRepository;
import com.farmacias.farmacia.repository.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repositorioProduto;
	
	@Autowired
	private CategoriaRepository repositorioCategoria;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repositorioProduto.findAll());
		
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto (@RequestBody CadastroDeProduto cadastroDeProduto){
		
		// Procura a categoria com o id passado no json no banco de dados
		Optional<Categoria> categoriaOptional = repositorioCategoria.findById(cadastroDeProduto.getCategoriaId());
		
		// Se o optional da consulta da categoria estiver vazio, mostra uma mensagem falando que a categoria não existe
		if (!categoriaOptional.isPresent())
			System.out.println("A categoria não existe.");
		
		// Pega a categoria de dentro do optional
		Categoria categoria = categoriaOptional.get();
		
		// Cria um produto com base nas informações passadas pelo json e com a categoria consultada no banco de dados
		Produto produto = new Produto(cadastroDeProduto.getNome(), cadastroDeProduto.getDescricao(), categoria);
		
		// Salva o produto e retorna o produto salvo no response entity
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorioProduto.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repositorioProduto.deleteById(id);
	}
	
	@PutMapping
	public ResponseEntity<Produto> putProduto (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repositorioProduto.save(produto));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getbyId(@PathVariable Integer id){
		return repositorioProduto.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
}
