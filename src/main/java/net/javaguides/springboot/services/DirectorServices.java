package net.javaguides.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Director;
import net.javaguides.springboot.repository.DirectorRepository;

@Service
public class DirectorServices {
	
	@Autowired DirectorRepository directorRepository;
	
	public Director createDirectorInfos(Director director) {
		return directorRepository.save(director);
	}
	
	public List<Director> getAllDirectorInfos(){
		return directorRepository.findAll();
	}
	
	public Optional<Director> getDirectorInfosById(long id){
		return directorRepository.findById(id);
	}
	
	public Director updateDirectorInfosById(Director director) {
		return directorRepository.save(director);
	}
	
	public void deleteDirectorInfosById(long id) {
		 directorRepository.deleteById(id);
	} 

}
