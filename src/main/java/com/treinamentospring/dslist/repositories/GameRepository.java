package com.treinamentospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentospring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
