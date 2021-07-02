package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
