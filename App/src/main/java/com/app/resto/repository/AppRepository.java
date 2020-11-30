package com.app.resto.repository;

import com.app.resto.model.Resto;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends CrudRepository<Resto, Long>{
	List<Resto> findByNameResto(String nameResto);
	
	List<Resto> findByTypeResto(String typeResto);
}
