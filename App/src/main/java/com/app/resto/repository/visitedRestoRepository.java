package com.app.resto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.resto.model.Visits;

@Repository
public interface visitedRestoRepository extends JpaRepository<Visits, Long>{
	
}
