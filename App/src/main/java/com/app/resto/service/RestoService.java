package com.app.resto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.resto.model.*;
import com.app.resto.repository.*;

@Service
public class RestoService{
	
	@Autowired
	private AppRepository appRepository;
	
	@Autowired
	private visitedRestoRepository visitedRepository;
	
	public List<Resto> getAllRestos(){
		return (List<Resto>) appRepository.findAll();
	}

	public List<Visits> getAllVisits(){
		return visitedRepository.findAll();
	}
	
	public void addVisits(Visits visits) {
		visitedRepository.save(visits);
	}
	
}
