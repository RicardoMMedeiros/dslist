package com.treinamentospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentospring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
