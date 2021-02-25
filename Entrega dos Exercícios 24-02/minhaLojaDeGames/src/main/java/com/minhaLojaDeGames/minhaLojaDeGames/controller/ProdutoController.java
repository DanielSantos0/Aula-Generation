package com.minhaLojaDeGames.minhaLojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;
import com.minhaLojaDeGames.minhaLojaDeGames.model.Produto;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.CategoriaRepositorio;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.ProdutoRepositorio;

@Controller
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepositorio repositorioProduto;
	
	@Autowired
	private CategoriaRepositorio repositorioCategoria;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto(){
		return ResponseEntity.ok(repositorioProduto.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto(@RequestBody CadastroDeProduto cadastroDeProduto){
		
		Optional<Categoria> categoriaOptinal = repositorioCategoria.findById(cadastroDeProduto.getCategoriaId());
		
		Categoria categoria = categoriaOptinal.get();
		
		Produto produto = new Produto(cadastroDeProduto.getNome(), cadastroDeProduto.getDescricao(), categoria);
		
		repositorioProduto.save(produto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repositorioProduto.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> putProduto(@PathVariable ("id") Integer id, @RequestBody AlterarProduto alterarProduto){
		
		Optional<Produto> alterarProdutoOptional =  repositorioProduto.findById(id);
		
		Produto produtoQueSeraAlterado = alterarProdutoOptional.get();
		
		produtoQueSeraAlterado.setNome(alterarProduto.getNome());
		produtoQueSeraAlterado.setDescricao(alterarProduto.getDescricao());
		
		repositorioProduto.save(produtoQueSeraAlterado);
		
		return ResponseEntity.ok(produtoQueSeraAlterado);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> findByIdProduto (@PathVariable Integer id){
		return repositorioProduto.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	

}
