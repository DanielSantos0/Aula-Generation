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
import com.minhaLojaDeGames.minhaLojaDeGames.model.Usuario;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.UsuarioRepositorio;

@Controller
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepositorio repositorioUsuario;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAllUsuario(){
		return ResponseEntity.ok(repositorioUsuario.findAll());
	}
	
	@GetMapping
	public ResponseEntity<Optional<Usuario>> findByIdUsuario(@PathVariable Integer id){
		return ResponseEntity.ok(repositorioUsuario.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repositorioUsuario.deleteById(id);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> postUsuario(Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorioUsuario.save(usuario));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> putUsuario(@PathVariable ("id") Integer id, @RequestBody AlterarUsuario alterarUsuario){
		
		Optional<Usuario> alterarUsuarioOptinal =  repositorioUsuario.findById(id);
		
		Usuario usuarioQueSeraAlterado = alterarUsuarioOptinal.get();
		
		usuarioQueSeraAlterado.setNome(alterarUsuario.getNome());
		usuarioQueSeraAlterado.setCpf(alterarUsuario.getCpf());
		
		repositorioUsuario.save(usuarioQueSeraAlterado);
		
		return ResponseEntity.ok(usuarioQueSeraAlterado);
		
	}

}
