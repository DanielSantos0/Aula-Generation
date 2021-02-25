package com.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{
	public List<Categoria> findAllByCategoriaContainingIgnoreCase (String categoria);

	

}
