package net.javaguides.springboot.controller;

import java.util.Collections;
import java.util.List;

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

import net.javaguides.springboot.model.Actor;
import net.javaguides.springboot.model.Director;
import net.javaguides.springboot.model.Movies;
import net.javaguides.springboot.services.ActorServices;
import net.javaguides.springboot.services.DirectorServices;
import net.javaguides.springboot.services.MoviesServices;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1")
public class MoviesController {
	
	@Autowired MoviesServices moviesServices;
	@Autowired ActorServices actorServices;
	@Autowired DirectorServices directorServices;
	
	@PostMapping("movies")
	public ResponseEntity<?> createMoviesInfos(@RequestBody Movies movies){
		moviesServices.createMoviesInfos(movies);
		return new ResponseEntity<>(Collections.EMPTY_LIST,HttpStatus.OK);
	}
	
	@GetMapping("movies/{id}")
	public ResponseEntity<?> getMoviesInfosById(@PathVariable(value="id") Long id){
		Movies save=moviesServices.getMoviesInfosById(id);
		return new ResponseEntity<>(save,HttpStatus.OK);
	}
	
	@GetMapping("movies")
	public ResponseEntity<?> getAllMoviesInfos(){
		List<Movies> save=moviesServices.getAllMoviesInfos();
		return new ResponseEntity<>(save,HttpStatus.OK);
	}
	
	@DeleteMapping("movies/{id}")
	public ResponseEntity<?> deleteMoviesInfosById(@PathVariable(value="id") Long id){
		moviesServices.deleteMoviesInfosById(id);
		return new ResponseEntity<>(Collections.EMPTY_LIST,HttpStatus.OK);
	}
	
	@PutMapping("movies/{id}")
	public ResponseEntity<?> updateMoviesById(@RequestBody Movies moviesDetails,@PathVariable(value="id") Long id){
		
		Movies movies=moviesServices.getMoviesInfosById(id);
		if(movies!=null) {
		movies.setmName(moviesDetails.getmName());
		movies.setActor(moviesDetails.getActor());
		movies.setDirector(moviesDetails.getDirector());
		movies.setLanguage(moviesDetails.getLanguage());
		movies.setYear(moviesDetails.getYear());
		
		moviesServices.updateMoviesInfosById(movies);
		return new ResponseEntity<>(movies,HttpStatus.OK);
		}
		
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	
	
	@PostMapping("actor")
	public ResponseEntity<?> createActorInfos(@RequestBody Actor actor){
		actorServices.createActorInfos(actor);
		return new ResponseEntity<>("Successfully saved",HttpStatus.OK);
	}
	
	@GetMapping("actor/{id}")
	public ResponseEntity<?> getActorInfosById(@PathVariable Long id){
		actorServices.getActorInfosById(id);
		return new ResponseEntity<>("Successfully retrieve actor",HttpStatus.OK);
	}
	
	@GetMapping("actor")
	public ResponseEntity<?> getAllActorInfos(){
		List<Actor>save= actorServices.getAllActorInfos();
		return new ResponseEntity<>(save,HttpStatus.OK);
	}
	
	@DeleteMapping("actor/{id}")
	public ResponseEntity<?> deleteActorInfosById(@PathVariable(value="id") Long id){
		actorServices.deleteActorInfosById(id);
		return new ResponseEntity<>("Successfully deleted movie",HttpStatus.OK);
	}
	
	@PutMapping("actor/{id}")
	public ResponseEntity<?> updateActorInfosById(@RequestBody Actor actorDetails,long id){
		Actor actor=actorServices.getActorInfosById(id).get();
		
		actor.setaName(actorDetails.getaName());
		actor.setHits(actorDetails.getHits());
		actor.setFlops(actorDetails.getFlops());
		actor.setIndustry(actorDetails.getIndustry());
		
		return new ResponseEntity<>("Successfully updated",HttpStatus.OK);
	}
	
	
	@PostMapping("director")
	public ResponseEntity<?> createDirectorInfos(@RequestBody Director director){
		directorServices.createDirectorInfos(director);
		return new ResponseEntity<>("Successfully saved",HttpStatus.OK);
	}
	
	@GetMapping("director/{id}")
	public ResponseEntity<?> getDirectorInfosById(@PathVariable long id){
		directorServices.getDirectorInfosById(id);
		return new ResponseEntity<>("Successfully retrieve director",HttpStatus.OK);
	}
	
	@GetMapping("director")
	public ResponseEntity<?> getAllDirectorInfos(){
		List<Director>save=directorServices.getAllDirectorInfos();
		return new ResponseEntity<>(save,HttpStatus.OK);
	}
	
	@DeleteMapping("director/{id}")
	public ResponseEntity<?> deleteDirectorInfosById(@PathVariable long id){
		directorServices.deleteDirectorInfosById(id);
		return new ResponseEntity<>("Successfully deleted director",HttpStatus.OK);
	}
	
	@PutMapping("director/{id}")
	public ResponseEntity<?> updateDirectorInfosById(@RequestBody Director directorDetails,long id){
		Director director=directorServices.getDirectorInfosById(id).get();
		
		director.setdName(directorDetails.getdName());
		director.setHits(directorDetails.getHits());
		director.setFlops(directorDetails.getFlops());
		director.setIndustry(directorDetails.getIndustry());
		
		return new ResponseEntity<>("Successfully updated",HttpStatus.OK);
	}
}
