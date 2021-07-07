package net.javaguides.springboot.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{
	
	public Movies findFirstById(long id);
	@Query("select m from Movies m where lower(m.mName) LIKE %:searchKey%")
	public List<Movies> findList(@Param("searchKey") String searchKey);

}