package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ifce.br.model.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>{

}
