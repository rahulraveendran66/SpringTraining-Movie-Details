package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{
	
	public Movies findFirstById(long id);


}