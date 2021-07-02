package net.javaguides.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Actor;
import net.javaguides.springboot.repository.ActorRepository;

@Service
public class ActorServices {
	
	@Autowired ActorRepository actorRepository;
	
	public Actor createActorInfos(Actor actor) {
		return actorRepository.save(actor);
	}
	
	public List<Actor> getAllActorInfos(){
		return actorRepository.findAll();
	}
	
	public Optional<Actor> getActorInfosById(long id){
		return actorRepository.findById(id);
	}
	
	public Actor updateActorInfosById(Actor actor) {
		return actorRepository.save(actor);
	}
	
	public void deleteActorInfosById(long id) {
		 actorRepository.deleteById(id);
	} 

}
