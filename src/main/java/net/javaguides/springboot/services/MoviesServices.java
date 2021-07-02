package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Movies;
import net.javaguides.springboot.repository.MoviesRepository;

@Service
public class MoviesServices {
	
	@Autowired MoviesRepository moviesRepository;
	
	public Movies createMoviesInfos(Movies movies) {
		return moviesRepository.save(movies);
	}
	
	public List<Movies> getAllMoviesInfos(){
		return moviesRepository.findAll();
	}
	
	public Movies getMoviesInfosById(long id){
		return moviesRepository.findFirstById(id);
	}
	
	public Movies updateMoviesInfosById(Movies movies) {
		return moviesRepository.save(movies);
	}
	
	public void deleteMoviesInfosById(long id) {
		 moviesRepository.deleteById(id);
	}


	
}
